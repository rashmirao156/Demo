package com.deloitte.sample.integration.demo.publisher.gateway;

import com.deloitte.sample.integration.demo.publisher.configuration.SecurityPublisherConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.direct.DirectConsumerNotAvailableException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SecurityPublishInboundGateway extends RouteBuilder {
  public static final String SECURITY_PUBLISH_ROUTE_URI = "direct:security-publish-route-uri";

  public static final String SECURITY_PUBLISH_QUEUE_ROUTE_ID = "security_publisher_queue";

  @Autowired SecurityPublisherConfiguration securityPublisherConfiguration;

  @Override
  public void configure() throws Exception {

    onException(DirectConsumerNotAvailableException.class)
        .logHandled(true)
        .log("unable to route message ${body}")
        .handled(true);

    from(securityPublisherConfiguration.getSecurityPublishInboundJmsUri())
        .routeId(SECURITY_PUBLISH_QUEUE_ROUTE_ID)
        .to(SECURITY_PUBLISH_ROUTE_URI);
  }
}
