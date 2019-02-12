package com.deloitte.sample.integration.demo.publisher.route;

import com.deloitte.sample.integration.demo.publisher.gateway.TradePublishInboundGateway;
import com.deloitte.sample.integration.demo.publisher.gateway.TradePublishOutboundGateway;
import com.deloitte.sample.integration.demo.publisher.transformation.transformer.TradeTransformer;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.converter.jaxb.JaxbDataFormat;
import org.apache.camel.spi.DataFormat;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;

@Component
public class TradePublishRoute extends RouteBuilder {
  DataFormat formatter =
      new JaxbDataFormat("com.deloitte.sample.integration.demo.publisher.transformation.fixml");

  @Override
  public void configure() throws Exception {
    from(TradePublishInboundGateway.TRADE_PUBLISH_ROUTE_URI)
        .to("log:?level=INFO&showBody=true")
        .split(xpath("/TRANSACTIONS/TRADE"))
        .convertBodyTo(Document.class)
        .bean(new TradeTransformer())
        .to("direct:publish");

    from("direct:publish")
        .to("log:?level=INFO&showBody=true")
        .marshal(formatter)
        .to(TradePublishOutboundGateway.PUBLISH_TRADE_ROUTE_OUTBOUND_GATEWAY_URI);
  }
}
