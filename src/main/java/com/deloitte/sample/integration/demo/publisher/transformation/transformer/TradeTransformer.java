package com.deloitte.sample.integration.demo.publisher.transformation.transformer;

import com.deloitte.sample.integration.demo.publisher.transformation.director.FIXMLDirector;
import com.deloitte.sample.integration.demo.publisher.transformation.fixml.FIXML;
import org.apache.camel.Exchange;
import org.w3c.dom.Document;

import javax.xml.transform.dom.DOMSource;

public class TradeTransformer {

  public FIXML transform(Exchange exchange) throws Exception {

    System.out.print("INCOMING MESSAGE IS :" + exchange.getIn().getBody().toString());
    Document body = (Document) exchange.getIn().getBody();
    DOMSource tradeSource = new DOMSource(body);
    FIXMLDirector fixmlDirector = new FIXMLDirector(tradeSource);
    return fixmlDirector.construct();
  }
}
