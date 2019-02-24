package com.deloitte.sample.integration.demo.transformation.director;

import com.deloitte.sample.integration.demo.transformation.builder.FIXMLBuilder;
import com.deloitte.sample.integration.demo.transformation.builder.impl.TradeCaptureReportMessageTFIXMLBuilder;
import com.deloitte.sample.integration.demo.transformation.builder.impl.TrdCapRptSideGrpBlockTFIXMLBuilder;
import com.deloitte.sample.integration.demo.transformation.fixml.TradeCaptureReportMessageT;
import com.deloitte.sample.integration.demo.transformation.fixml.FIXML;

import javax.xml.transform.dom.DOMSource;

public class FIXMLDirector {
  private FIXMLBuilder tradeCaptRptFixmlBuilder;
  private FIXMLBuilder rptSideBuilder;
  private TradeCaptureReportMessageT tradeCaptureReportMessageT;
  private DOMSource tradeDomSource;

  public FIXMLDirector(DOMSource tradeDomSource) {
    this.tradeCaptureReportMessageT = new TradeCaptureReportMessageT();
    tradeCaptRptFixmlBuilder =
        new TradeCaptureReportMessageTFIXMLBuilder(tradeCaptureReportMessageT);
    rptSideBuilder = new TrdCapRptSideGrpBlockTFIXMLBuilder(tradeCaptureReportMessageT);
    this.tradeDomSource = tradeDomSource;
  }

  public FIXML construct() throws Exception{
    tradeCaptRptFixmlBuilder.build(tradeDomSource);
    rptSideBuilder.build(tradeDomSource);
    return tradeCaptRptFixmlBuilder.build();
  }


}
