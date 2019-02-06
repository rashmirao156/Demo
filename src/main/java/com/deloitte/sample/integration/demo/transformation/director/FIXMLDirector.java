package com.deloitte.sample.integration.demo.transformation.director;

import com.deloitte.sample.integration.demo.transformation.builder.FIXMLBuilder;
import com.deloitte.sample.integration.demo.transformation.builder.impl.TradeCaptureReportMessageTFIXMLBuilder;
import com.deloitte.sample.integration.demo.transformation.fixml.TradeCaptureReportMessageT;
import com.deloitte.sample.integration.demo.transformation.fixml.fixml.FIXML;

import javax.xml.transform.dom.DOMSource;

public class FIXMLDirector {
  private FIXMLBuilder tradeCaptRptFixmlBuilder;
  private TradeCaptureReportMessageT tradeCaptureReportMessageT;
  private DOMSource tradeDomSource;

  public FIXMLDirector(DOMSource tradeDomSource) {
    this.tradeCaptureReportMessageT = new TradeCaptureReportMessageT();
    tradeCaptRptFixmlBuilder =
        new TradeCaptureReportMessageTFIXMLBuilder(tradeCaptureReportMessageT);
    this.tradeDomSource = tradeDomSource;
  }

  public FIXML construct() {

    return tradeCaptRptFixmlBuilder.build(tradeDomSource);
  }
}
