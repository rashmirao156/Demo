package com.deloitte.sample.integration.demo.publisher.gateway;

import com.deloitte.sample.integration.demo.publisher.configuration.SecurityPublisherConfiguration;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SecurityPublishOutboundGateway extends RouteBuilder {

  @Autowired SecurityPublisherConfiguration securityPublisherConfiguration;

  public static final String SECURITY_PUB_ROUTE_ID = "security-publish-outbound";
  public static final String PUBLISH_SECURITY_ROUTE_OUTBOUND_GATEWAY_URI =
      "direct:" + SECURITY_PUB_ROUTE_ID;

  @Override
  public void configure() throws Exception {

    onException(Exception.class)
        .logHandled(true)
        .log("unable to route message ${body}")
        .handled(true);

    from(PUBLISH_SECURITY_ROUTE_OUTBOUND_GATEWAY_URI)
        .routeId(SECURITY_PUB_ROUTE_ID)
        .to(securityPublisherConfiguration.getSecurityPublishOutboundJmsUri());
  }
}
