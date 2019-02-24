package com.deloitte.sample.integration.demo.transformation.transformer;

import com.deloitte.sample.integration.demo.constant.TradeMappingConstants;
import com.deloitte.sample.integration.demo.transformation.director.FIXMLDirector;
import com.deloitte.sample.integration.demo.transformation.fixml.FIXML;
import org.apache.camel.Exchange;
import org.springframework.xml.xpath.Jaxp13XPathTemplate;
import org.springframework.xml.xpath.XPathOperations;
import org.w3c.dom.Document;

import javax.xml.transform.dom.DOMSource;

public class TradeTransformer {

  protected XPathOperations template = new Jaxp13XPathTemplate();

  public FIXML transform(Document trade) throws Exception {

    //System.out.print("INCOMING MESSAGE IS :" + exchange.getIn().getBody().toString());
   // Document body = (Document) exchange.getIn().getBody();
    DOMSource tradeSource = new DOMSource(template.evaluateAsNode(TradeMappingConstants.TRADE_ROOT, new DOMSource(trade)));
    FIXMLDirector fixmlDirector = new FIXMLDirector(tradeSource);
    return fixmlDirector.construct();
  }
}
