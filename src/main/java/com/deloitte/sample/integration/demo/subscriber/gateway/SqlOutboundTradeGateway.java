package com.deloitte.sample.integration.demo.subscriber.gateway;

import com.deloitte.sample.integration.demo.subscriber.service.TradehubDeliverTradeService;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class SqlOutboundTradeGateway extends RouteBuilder {

  public static final String TRADE_INSERT_TRADE_ROUTE_ID = "tradehub-trade-insert";
  public static final String TRADEHUB_INSERT_TRADE_ROUTE_URI =
      "direct:" + TRADE_INSERT_TRADE_ROUTE_ID;

  @Override
  public void configure() throws Exception {

    onException(Exception.class)
        .logHandled(true)
        .log("unable to route message ${body}")
        .handled(true);

    from(TRADEHUB_INSERT_TRADE_ROUTE_URI)
        .routeId(TRADE_INSERT_TRADE_ROUTE_ID)
        .bean(TradehubDeliverTradeService.class);
  }
}
