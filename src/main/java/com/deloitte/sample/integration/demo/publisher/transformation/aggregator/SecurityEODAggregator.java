package com.deloitte.sample.integration.demo.publisher.transformation.aggregator;

import com.deloitte.sample.integration.demo.publisher.transformation.securitycanon.ASSETS;
import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;

import static org.apache.camel.Exchange.EXCEPTION_CAUGHT;

public class SecurityEODAggregator implements AggregationStrategy {

  @Override
  public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
    boolean isError = newExchange.getProperties().containsKey(EXCEPTION_CAUGHT);
    if (oldExchange == null) {
      if (isError) {
        newExchange.getIn().setBody(null);
      }
      return newExchange;
    }
    if (isError) {
      return oldExchange;
    }
    if (oldExchange.getIn().getBody() == null) {
      oldExchange.getIn().setBody(newExchange.getIn().getBody());
      return oldExchange;
    }
    oldExchange
        .getIn()
        .getBody(ASSETS.class)
        .getASSET()
        .addAll(newExchange.getIn().getBody(ASSETS.class).getASSET());
    return oldExchange;
  }
}
