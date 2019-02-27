package com.deloitte.sample.integration.demo.adapter.route;

import com.deloitte.sample.integration.demo.adapter.constant.AdapterTrackingStatus;
import com.deloitte.sample.integration.demo.adapter.tracking.BusinessData;
import com.deloitte.sample.integration.demo.adapter.tracking.DefaultTrackingRoute;
import com.deloitte.sample.integration.demo.adapter.tracking.TrackingSample;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class TrackingRoute extends RouteBuilder {
  public static final String RECIEVED_TRACKING_ROUTE = "direct:recievedtrackinguri";
  public static final String SENT_TRACKING_ROUTE = "direct:senttrackinguri";

  @Override
  public void configure() throws Exception {

    from(RECIEVED_TRACKING_ROUTE)
        .process(
            exchange -> {
              TrackingSample trackingSample = new TrackingSample();
              trackingSample.setId(exchange.getExchangeId());
              BusinessData businessData = new BusinessData();
              businessData.setFund(exchange.getProperty("FUND", String.class));
              businessData.setInvNum(exchange.getProperty("INVNUM", String.class));
              trackingSample.setBusinessData(businessData);
              trackingSample.setTrackingStatus(AdapterTrackingStatus.RECEIVED);
              exchange.getIn().setBody(trackingSample);
            })
        .to(DefaultTrackingRoute.TRACKING_ROUTE_URI);

    from(SENT_TRACKING_ROUTE)
        .process(
            exchange -> {
              TrackingSample trackingSample = new TrackingSample();
              trackingSample.setId(exchange.getExchangeId());
              BusinessData businessData = new BusinessData();
              businessData.setFund(exchange.getProperty("FUND", String.class));
              businessData.setInvNum(exchange.getProperty("INVNUM", String.class));
              trackingSample.setBusinessData(businessData);
              trackingSample.setTrackingStatus(AdapterTrackingStatus.SENT);
              exchange.getIn().setBody(trackingSample);
            })
        .to(DefaultTrackingRoute.TRACKING_ROUTE_URI);
  }
}
