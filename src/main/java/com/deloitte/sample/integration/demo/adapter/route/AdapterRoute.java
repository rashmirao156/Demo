package com.deloitte.sample.integration.demo.adapter.route;

import com.deloitte.sample.integration.demo.adapter.configuration.AdapterConfiguration;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AdapterRoute extends RouteBuilder {
  private static final String APP_NAME_JMS_HEADER = "APP_NAME_JMS_HEADER";
  private static final String MESSAGE_VERSION_JMS_HEADER = "MESSAGE_VERSION_JMS_HEADER";
  private static final String SERVICE_VERSION_JMS_HEADER = "SERVICE_VERSION_JMS_HEADER";
  private static final String MESSAGE_TYPE_JMS_HEADER = "MESSAGE_TYPE_JMS_HEADER";

  @Autowired AdapterConfiguration adapterConfiguration;

  @Override
  public void configure() throws Exception {

    /* Route mocking Adapter behaviour .
    consumes messages from inbound queue such as IBM MQ / activemq,
     adds headers enabling tracking,
     sends acknowledgement  that message was recieved,
     forwards the message to outbound queue*/
    from(adapterConfiguration.getAdpTradeInboundQueueUri())
            .wireTap(TrackingRoute.RECIEVED_TRACKING_ROUTE)
            // .to("direct:ack-route")
            .setHeader(APP_NAME_JMS_HEADER, constant("accelerator-adapter"))
            .setHeader(MESSAGE_VERSION_JMS_HEADER, constant("1.0.0"))
            .setHeader(SERVICE_VERSION_JMS_HEADER, constant("1.0.0"))
            .setHeader(MESSAGE_TYPE_JMS_HEADER, constant("raw"))
            .to(adapterConfiguration.getAdpTradeOutboundQueueUri())
            .wireTap(TrackingRoute.SENT_TRACKING_ROUTE);

    from(adapterConfiguration.getAdpSecurityInboundQueueUri())
            // .to("direct:ack-route")
            .setHeader(APP_NAME_JMS_HEADER, constant("accelerator-adapter"))
            .setHeader(MESSAGE_VERSION_JMS_HEADER, constant("1.0.0"))
            .setHeader(SERVICE_VERSION_JMS_HEADER, constant("1.0.0"))
            .setHeader(MESSAGE_TYPE_JMS_HEADER, constant("raw"))
            .to(adapterConfiguration.getAdpSecurityOutboundQueueUri());

    from(adapterConfiguration.getAdpEODSecurityInboundQueueUri())
            // .to("direct:ack-route")
            .setHeader(APP_NAME_JMS_HEADER, constant("accelerator-adapter"))
            .setHeader(MESSAGE_VERSION_JMS_HEADER, constant("1.0.0"))
            .setHeader(SERVICE_VERSION_JMS_HEADER, constant("1.0.0"))
            .setHeader(MESSAGE_TYPE_JMS_HEADER, constant("raw"))
            .to(adapterConfiguration.getAdpEODSecurityOutboundQueueUri());
  }




}
