package com.deloitte.sample.integration.demo.publisher.gateway;

import com.deloitte.sample.integration.demo.publisher.configuration.SecurityPublisherConfiguration;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SecurityEODPublishOutboundGateway extends RouteBuilder {

  @Autowired SecurityPublisherConfiguration securityPublisherConfiguration;

  public static final String SECURITY_EOD_PUB_ROUTE_ID = "security-eod-publish-outbound";
  public static final String EOD_PUBLISH_SECURITY_ROUTE_OUTBOUND_GATEWAY_URI =
      "direct:" + SECURITY_EOD_PUB_ROUTE_ID;

  @Override
  public void configure() throws Exception {

    onException(Exception.class)
        .logHandled(true)
        .log("unable to route message ${body}")
        .handled(true);

    from(EOD_PUBLISH_SECURITY_ROUTE_OUTBOUND_GATEWAY_URI)
        .routeId(SECURITY_EOD_PUB_ROUTE_ID)
        .to(securityPublisherConfiguration.getSecurityEodPublishOutboundJmsUri());
  }
}
