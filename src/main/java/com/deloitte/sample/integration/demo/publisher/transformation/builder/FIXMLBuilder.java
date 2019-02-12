package com.deloitte.sample.integration.demo.publisher.transformation.builder;

import com.deloitte.sample.integration.demo.publisher.transformation.fixml.FIXML;

import javax.xml.transform.dom.DOMSource;

public interface FIXMLBuilder {

  public FIXML build(DOMSource source);
}
