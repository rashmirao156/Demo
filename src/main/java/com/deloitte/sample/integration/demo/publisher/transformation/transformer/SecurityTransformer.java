package com.deloitte.sample.integration.demo.publisher.transformation.transformer;

import com.deloitte.sample.integration.demo.publisher.transformation.builder.impl.SecurityBuilderImpl;
import com.deloitte.sample.integration.demo.publisher.transformation.director.SecurityDirector;
import com.deloitte.sample.integration.demo.publisher.transformation.securitycanon.ASSETS;
import org.apache.camel.Exchange;
import org.w3c.dom.Document;

import javax.xml.transform.dom.DOMSource;

public class SecurityTransformer {

  public ASSETS transform(Exchange exchange) throws Exception {

    Document body = (Document) exchange.getIn().getBody();
    DOMSource securitySource = new DOMSource(body);
    SecurityDirector securityDirector = new SecurityDirector(new SecurityBuilderImpl(securitySource));
    return securityDirector.construct();
  }
}
