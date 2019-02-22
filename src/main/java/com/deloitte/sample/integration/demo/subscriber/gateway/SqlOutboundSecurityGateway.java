package com.deloitte.sample.integration.demo.subscriber.gateway;

import com.deloitte.sample.integration.demo.subscriber.service.SecurityService;
import com.deloitte.sample.integration.demo.subscriber.service.TradehubDeliverTradeService;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class SqlOutboundSecurityGateway extends RouteBuilder {

  public static final String INSERT_SECURITY_ROUTE_ID = "markitedm-security-insert";
  public static final String MARKITEDM_INSERT_SECURITY_ROUTE_URI =
      "direct:" + INSERT_SECURITY_ROUTE_ID;

  @Override
  public void configure() throws Exception {

    onException(Exception.class)
        .logHandled(true)
        .log("unable to route message ${body}")
        .handled(true);

    from(MARKITEDM_INSERT_SECURITY_ROUTE_URI)
        .routeId(INSERT_SECURITY_ROUTE_ID)
        .bean(SecurityService.class);
  }
}
