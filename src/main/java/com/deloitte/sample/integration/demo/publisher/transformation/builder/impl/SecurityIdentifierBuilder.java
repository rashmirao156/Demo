package com.deloitte.sample.integration.demo.publisher.transformation.builder.impl;

import com.deloitte.sample.integration.demo.publisher.constant.SecurityMappingConstants;
import com.deloitte.sample.integration.demo.publisher.transformation.securitycanon.ASSETS;
import com.deloitte.sample.integration.demo.util.DomElementUtility;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import javax.xml.transform.dom.DOMSource;

public class SecurityIdentifierBuilder {

  public ASSETS.ASSET.SECURITYIDENTIFIERS setSecurityIdentifiers(DOMSource source) {
    ASSETS.ASSET.SECURITYIDENTIFIERS securityIdentifiers = new ASSETS.ASSET.SECURITYIDENTIFIERS();
    Node node = source.getNode();
    if (!(node instanceof Document)) {
      return null;
    }
    Document document = (Document) source.getNode();
    Element element = document.getDocumentElement();

    DomElementUtility utility = new DomElementUtility(element);
    securityIdentifiers.setCUSIP(utility.getElementContentAsString(SecurityMappingConstants.CUSIP));

    return securityIdentifiers;
  }
}
