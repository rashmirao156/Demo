package com.deloitte.sample.integration.demo.publisher.route;

import com.deloitte.sample.integration.demo.publisher.gateway.SecurityPublishInboundGateway;
import com.deloitte.sample.integration.demo.publisher.gateway.SecurityPublishOutboundGateway;
import com.deloitte.sample.integration.demo.publisher.transformation.processor.SecurityNuggetProcessor;
import com.deloitte.sample.integration.demo.publisher.transformation.processor.TradeNuggetProcessor;
import com.deloitte.sample.integration.demo.publisher.transformation.transformer.SecurityTransformer;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.converter.jaxb.JaxbDataFormat;
import org.apache.camel.spi.DataFormat;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;

@Component
public class SecurityRoute extends RouteBuilder {
  DataFormat formatter =
      new JaxbDataFormat(
          "com.deloitte.sample.integration.demo.publisher.transformation.securitycanon");

  @Override
  public void configure() throws Exception {
    from(SecurityPublishInboundGateway.SECURITY_PUBLISH_ROUTE_URI)
        .to(
            "log:?level=DEBUG&showExchangeId=true&showBody=false&multiline=true&showBodyType=false&showExchangePattern=false")
        .to(
            "log:Consumed SECURITY XML from Inbound SECURITY Queue. Starting Processing...?level=DEBUG&showExchangeId=true&showBody=false&multiline=true&showBodyType=false&showExchangePattern=false")
        .process(new SecurityNuggetProcessor())
        .split(xpath("/ASSETS/ASSET"))
        .convertBodyTo(Document.class)
        .bean(new SecurityTransformer())
        .to("direct:publish-security");

    from("direct:publish-security")
        .to(
            "log:?level=DEBUG&showExchangeId=true&showBody=false&multiline=true&showBodyType=false&showExchangePattern=false")
        .marshal(formatter)
        .to(
            "log:SECURITY TRANSFORMATION Completed...?level=DEBUG&showExchangeId=true&showBody=false&multiline=true&showBodyType=false&showExchangePattern=false")
        .to(SecurityPublishOutboundGateway.PUBLISH_SECURITY_ROUTE_OUTBOUND_GATEWAY_URI)
        .to(
            "log:SECURITY OUTPUL XML pushed to SECURITY outbound Queue?level=DEBUG&showExchangeId=true&showBody=false&multiline=true&showBodyType=false&showExchangePattern=false");
  }
}
