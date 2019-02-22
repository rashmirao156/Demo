package com.deloitte.sample.integration.demo.subscriber.gateway;

import com.deloitte.sample.integration.demo.subscriber.configuration.SecuritySubscriberConfiguration;
import com.deloitte.sample.integration.demo.subscriber.route.SecuritySubscriberRoute;
import com.deloitte.sample.integration.demo.subscriber.route.TradehubTradeRoutes;
import lombok.extern.slf4j.Slf4j;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.direct.DirectConsumerNotAvailableException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class JmsInboundSecurityGateway extends RouteBuilder {

  public static final String MARKITEDM_SECURITY_QUEUE_ROUTE_ID = "security_subscriber_queue";
  public static final String HANDLE_UNROUTABLE_MESSAGE_URI = "direct:adp-unroutable-message";

  @Autowired
  SecuritySubscriberConfiguration securitySubscriberConfiguration;

  @Override
  public void configure() throws Exception {

    onException(DirectConsumerNotAvailableException.class)
        .logHandled(true)
        .log("unable to route message ${body}")
        .handled(true);

    from(securitySubscriberConfiguration.getJmsInboundGatewayUri())
        .routeId(MARKITEDM_SECURITY_QUEUE_ROUTE_ID)
        .to(SecuritySubscriberRoute.SECURITY_SUB_PROCESSING_ROUTE_URI);
  }
}
