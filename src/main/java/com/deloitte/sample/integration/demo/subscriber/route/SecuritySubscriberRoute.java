package com.deloitte.sample.integration.demo.subscriber.route;

import com.deloitte.sample.integration.demo.subscriber.gateway.SqlOutboundSecurityGateway;
import com.deloitte.sample.integration.demo.subscriber.gateway.SqlOutboundTradeGateway;
import com.deloitte.sample.integration.demo.subscriber.processor.SecurityTransformer;
import com.deloitte.sample.integration.demo.subscriber.processor.TradehubTradeTransformer;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.converter.jaxb.JaxbDataFormat;
import org.apache.camel.spi.DataFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SecuritySubscriberRoute extends RouteBuilder {

  public static final String SEC_SUBSCRIBE_ROUTE_ID = "security-subscribe-trade-route";
  public static final String SECURITY_SUB_PROCESSING_ROUTE_URI = "direct:" + SEC_SUBSCRIBE_ROUTE_ID;

  @Autowired
  SecurityTransformer securityTransformer;

  @Override
  public void configure() throws Exception {
    DataFormat formatter =
        new JaxbDataFormat("com.deloitte.sample.integration.demo.publisher.transformation.securitycanon");

    onException(Exception.class).logHandled(true).handled(true);

    from(SECURITY_SUB_PROCESSING_ROUTE_URI)
        .routeId(SEC_SUBSCRIBE_ROUTE_ID)
        .unmarshal(formatter)
        .bean(securityTransformer)
        .to(SqlOutboundSecurityGateway.MARKITEDM_INSERT_SECURITY_ROUTE_URI);
  }
}
