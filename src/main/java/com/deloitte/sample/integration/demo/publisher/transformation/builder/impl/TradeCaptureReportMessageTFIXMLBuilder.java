package com.deloitte.sample.integration.demo.publisher.transformation.builder.impl;

import com.deloitte.sample.integration.demo.publisher.constant.TradeMappingConstants;
import com.deloitte.sample.integration.demo.publisher.transformation.builder.FIXMLBuilder;
import com.deloitte.sample.integration.demo.publisher.transformation.fixml.TradeCaptureReportMessageT;
import com.deloitte.sample.integration.demo.publisher.transformation.fixml.AbstractMessageT;
import com.deloitte.sample.integration.demo.publisher.transformation.fixml.FIXML;
import com.deloitte.sample.integration.demo.util.DomElementUtility;
import com.deloitte.sample.integration.demo.util.TimeConverterUtility;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import javax.xml.transform.dom.DOMSource;

public class TradeCaptureReportMessageTFIXMLBuilder implements FIXMLBuilder {
  private TradeCaptureReportMessageT tradeCaptureReportMessageT;

  public TradeCaptureReportMessageTFIXMLBuilder(
      TradeCaptureReportMessageT tradeCaptureReportMessageT) {
    this.tradeCaptureReportMessageT = tradeCaptureReportMessageT;
  }

  public FIXML build(final DOMSource tradeDomSource) {
    // TODO DomSource to Element conversion logic
    Node node = tradeDomSource.getNode();
    if (!(node instanceof Document)) {
      return null;
    }
    Document document = (Document) tradeDomSource.getNode();
    Element element = document.getDocumentElement();

    DomElementUtility utility = new DomElementUtility(element);

    tradeCaptureReportMessageT.setTrdNum(
        utility.getElementContentAsInteger(TradeMappingConstants.INVNUM));
    // TODO add Date conversion logic
    tradeCaptureReportMessageT.setTxnTm(
        TimeConverterUtility.getTargetFormat(
            utility.getElementContentAsString(TradeMappingConstants.EXECUTION_TIME)));
    tradeCaptureReportMessageT.setLastUpdateTm(null);
    tradeCaptureReportMessageT.setTrdDt(null);

    tradeCaptureReportMessageT.setTrdVer(
        utility.getElementContentAsString(TradeMappingConstants.TOUCHCOUNT));
    tradeCaptureReportMessageT.setSettlCcy(
        utility.getElementContentAsString(TradeMappingConstants.TRD_CURRENCY));

    tradeCaptureReportMessageT.setLastPx(
        utility.getElementContentAsBigDecimal(TradeMappingConstants.TRD_PRICE));
    tradeCaptureReportMessageT.setGrossTrdAmt(
        utility.getElementContentAsBigDecimal(TradeMappingConstants.TRD_PRINCIPAL));
    tradeCaptureReportMessageT.setTransTyp(
        utility.getElementContentAsInteger(TradeMappingConstants.TRD_STATUS));
    FIXML fixml = new FIXML();
    fixml.setMessage(getJaxbElement(tradeCaptureReportMessageT));

    return fixml;
  }

  private JAXBElement<? extends AbstractMessageT> getJaxbElement(
      TradeCaptureReportMessageT tradeCaptureReportMessageT) {
    return new JAXBElement(getQName(), AbstractMessageT.class, null, tradeCaptureReportMessageT);
  }

  private static final QName getQName() {
    String namespace = TradeMappingConstants.NAMESPACE;
    return new QName(namespace, "TrdCaptRpt");
  }
}
