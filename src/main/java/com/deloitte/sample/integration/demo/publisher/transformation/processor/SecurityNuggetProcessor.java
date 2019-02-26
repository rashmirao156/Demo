package com.deloitte.sample.integration.demo.publisher.transformation.processor;

import com.deloitte.sample.integration.demo.GlobalConstants;
import com.deloitte.sample.integration.demo.util.XMLConverterUtility;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.w3c.dom.Document;

import java.util.Map;

public class SecurityNuggetProcessor implements Processor {

  @Override
  public void process(Exchange exchange) throws Exception {

    Map<String, String> nuggetMap = (Map<String, String>) exchange.getIn().getBody();
    Document tradeDocument =
        XMLConverterUtility.getDocumentFromString(nuggetMap.get(GlobalConstants.SECURITY_KEY));
    exchange.getIn().setBody(tradeDocument);
  }
}
