package com.deloitte.sample.integration.demo.publisher.route;

import com.deloitte.sample.integration.demo.GlobalConstants;
import com.deloitte.sample.integration.demo.adapter.configuration.AdapterConfiguration;
import com.deloitte.sample.integration.demo.publisher.configuration.TradePublisherConfiguration;
import com.deloitte.sample.integration.demo.publisher.constant.TradeAckTemplateFields;
import com.deloitte.sample.integration.demo.publisher.constant.TradeMappingConstants;
import com.deloitte.sample.integration.demo.publisher.gateway.TradePublishInboundGateway;
import com.deloitte.sample.integration.demo.publisher.gateway.TradePublishOutboundGateway;
import com.deloitte.sample.integration.demo.publisher.transformation.processor.TradeAckProcessor;
import com.deloitte.sample.integration.demo.publisher.transformation.processor.TradeNuggetProcessor;
import com.deloitte.sample.integration.demo.publisher.transformation.transformer.TradeTransformer;
import com.deloitte.sample.integration.demo.util.XMLConverterUtility;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.converter.jaxb.JaxbDataFormat;
import org.apache.camel.spi.DataFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;

import java.util.HashMap;
import java.util.Map;

@Component
public class TradePublishRoute extends RouteBuilder {
  DataFormat formatter =
      new JaxbDataFormat("com.deloitte.sample.integration.demo.publisher.transformation.fixml");

  @Autowired TradePublisherConfiguration tradeConfiguration;

  @Override
  public void configure() throws Exception {
    from(TradePublishInboundGateway.TRADE_PUBLISH_ROUTE_URI)
        .to(
            "log:?level=DEBUG&showExchangeId=true&showBody=false&multiline=true&showBodyType=false&showExchangePattern=false")
        .to(
            "log:Consumed TRADE XML from Inbound TRADE Queue. Starting Processing...?level=DEBUG&showExchangeId=true&showBody=false&multiline=true&showBodyType=false&showExchangePattern=false")
        .process(new TradeNuggetProcessor())
        .split(xpath("/TRANSACTIONS/TRADE"))
        .setProperty(
            TradeMappingConstants.ACK_MAP_HEADER_KEY,
            method(TradeAckProcessor.class, "createTemplateData"))
        .convertBodyTo(Document.class)
        .bean(new TradeTransformer())
        .to("direct:publish");

    from("direct:publish")
        .to(
            "log:?level=DEBUG&showExchangeId=true&showBody=false&multiline=true&showBodyType=false&showExchangePattern=false")
        .marshal(formatter)
        .to(
            "log:TRADE TRANSFORMATION to FIXML Completed...?level=DEBUG&showExchangeId=true&showBody=false&multiline=true&showBodyType=false&showExchangePattern=false")
        .to(tradeConfiguration.getFixmlOutboundDirURI() + "${exchangeProperty.FIXML_FILE_NAME}")
        .to(
            "log:FIXML written to TRADE outbound folder:"
                + "?level=DEBUG&showExchangeId=true&showBody=false&multiline=true&showBodyType=false&showExchangePattern=false")
        .to(TradePublishOutboundGateway.PUBLISH_TRADE_ROUTE_OUTBOUND_GATEWAY_URI)
        .to(
            "log:FIXML pushed to TRADE outbound Queue?level=DEBUG&showExchangeId=true&showBody=false&multiline=true&showBodyType=false&showExchangePattern=false")
        .bean(TradeAckProcessor.class, "setSuccessfulTrade")
        .setHeader(TradeMappingConstants.ACK_MAP_HEADER_KEY, body())
        .to("direct:publish-ack-trade");

    from("direct:publish-ack-trade")
        .setBody(exchangeProperty(TradeMappingConstants.ACK_MAP_HEADER_KEY))
        .process(
            exchange -> {
              System.out.print(exchange.getProperty(TradeMappingConstants.ACK_MAP_HEADER_KEY));
            })
        .to("freemarker:acknowledgement.ftl")
        .to(TradePublishOutboundGateway.PUBLISH_ACK_TRADE)
        .to(
            "log:SUCCESS ACK message sent to TRADE ACK Queue?level=DEBUG&showExchangeId=true&showBody=false&multiline=true&showBodyType=false&showExchangePattern=false");
  }
}
