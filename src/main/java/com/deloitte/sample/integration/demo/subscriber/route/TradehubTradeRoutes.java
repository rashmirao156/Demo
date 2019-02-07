package com.deloitte.sample.integration.demo.subscriber.route;

import com.deloitte.sample.integration.demo.subscriber.gateway.SqlOutboundTradeGateway;
import com.deloitte.sample.integration.demo.subscriber.processor.TradehubTradeTransformer;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.converter.jaxb.JaxbDataFormat;
import org.apache.camel.spi.DataFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TradehubTradeRoutes extends RouteBuilder {

    public static final String TRADE_ROUTE_BASE_ID = "tradehub-trade-route";
    public static final String TRADE_PROCESSING_ROUTE_URI = "direct:"+ TRADE_ROUTE_BASE_ID;

    @Autowired
    TradehubTradeTransformer tradehubTradeTransformer;

    @Override
    public void configure() throws Exception{
        DataFormat formatter =
                new JaxbDataFormat("com.deloitte.sample.integration.demo.transformation.fixml:com.deloitte.sample.integration.demo.transformation.fixml");

        onException(Exception.class)
                .logHandled(true)
                .handled(true);

        from(TRADE_PROCESSING_ROUTE_URI)
                .routeId(TRADE_ROUTE_BASE_ID)
//                .unmarshal(formatter)
//                .transform(simple("body.payload.content[0]"))
                .bean(tradehubTradeTransformer)
                .to(SqlOutboundTradeGateway.TRADEHUB_INSERT_TRADE_ROUTE_URI);

    }
}
