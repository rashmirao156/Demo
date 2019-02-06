package com.deloitte.sample.integration.demo.route;

import com.deloitte.sample.integration.demo.transformation.transformer.TradeTransformer;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class TradeRoute extends RouteBuilder {
  @Override
  public void configure() throws Exception {
    from("activemq:queue:testQueue")
            .to("log:?level=INFO&showBody=true")
            .split(xpath("/TRANSACTIONS/TRADE"))
            .process(new TradeTransformer())
            .to("direct:readQueue");

    from("direct:readQueue")
            .to("log:?level=INFO&showBody=true")
            .to("activemq:queue:writeQueue");
  }
}
