package com.deloitte.sample.integration.demo.route;

import com.deloitte.sample.integration.demo.transformation.transformer.TradeTransformer;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.converter.jaxb.JaxbDataFormat;
import org.apache.camel.spi.DataFormat;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;

@Component
public class TradeRoute extends RouteBuilder {
  DataFormat formatter =
      new JaxbDataFormat("com.deloitte.sample.integration.demo.transformation.fixml");

  @Override
  public void configure() throws Exception {
    from("activemq:queue:testQueue")
        .to("log:?level=INFO&showBody=true")
        .split(xpath("/TRANSACTIONS/TRADE"))
        .convertBodyTo(Document.class)
        .bean(new TradeTransformer())
        .to("direct:readQueue");

    from("direct:readQueue")
        .to("log:?level=INFO&showBody=true")
        .marshal(formatter)
        .to("activemq:queue:writeQueue");
  }
}
