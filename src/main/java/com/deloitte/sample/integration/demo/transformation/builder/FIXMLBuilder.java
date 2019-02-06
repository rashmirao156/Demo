package com.deloitte.sample.integration.demo.transformation.builder;

import com.deloitte.sample.integration.demo.transformation.fixml.FIXML;

import javax.xml.transform.dom.DOMSource;

public interface FIXMLBuilder {

  public FIXML build(DOMSource source);
}
