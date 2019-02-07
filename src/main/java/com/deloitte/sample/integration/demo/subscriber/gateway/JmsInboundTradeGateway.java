package com.deloitte.sample.integration.demo.subscriber.gateway;

import com.deloitte.sample.integration.demo.configuration.PropertiesConfiguration;
import com.deloitte.sample.integration.demo.subscriber.route.TradehubTradeRoutes;
import lombok.extern.slf4j.Slf4j;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.direct.DirectConsumerNotAvailableException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class JmsInboundTradeGateway extends RouteBuilder {

    public static  final String TRADEHUB_TRADE_QUEUE_ROUTE_ID = "trade_subscriber_queue";
    public static final String HANDLE_UNROUTABLE_MESSAGE_URI = "direct:adp-unroutable-message";

    @Autowired
    PropertiesConfiguration propertiesConfiguration;

    @Override
    public void configure() throws Exception{

        onException(DirectConsumerNotAvailableException.class )
                .logHandled(true)
                .log("unable to route message ${body}")
                .handled(true);

        from(propertiesConfiguration.getJmsInboundGatewayUri())
                .routeId(TRADEHUB_TRADE_QUEUE_ROUTE_ID)
                .to(TradehubTradeRoutes.TRADE_PROCESSING_ROUTE_URI);
    }
}
