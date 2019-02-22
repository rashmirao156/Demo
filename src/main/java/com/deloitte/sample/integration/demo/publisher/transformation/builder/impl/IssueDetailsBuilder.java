package com.deloitte.sample.integration.demo.publisher.transformation.builder.impl;

import com.deloitte.sample.integration.demo.publisher.constant.SecurityMappingConstants;
import com.deloitte.sample.integration.demo.publisher.transformation.securitycanon.ASSETS;
import com.deloitte.sample.integration.demo.util.DomElementUtility;
import com.deloitte.sample.integration.demo.util.TimeConverterUtility;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import javax.xml.transform.dom.DOMSource;

public class IssueDetailsBuilder {

  public ASSETS.ASSET.ISSUEDETAILS setIssueDetails(DOMSource source) {
    ASSETS.ASSET.ISSUEDETAILS issueDetails = new ASSETS.ASSET.ISSUEDETAILS();
    Node node = source.getNode();
    if (!(node instanceof Document)) {
      return null;
    }
    Document document = (Document) source.getNode();
    Element element = document.getDocumentElement();

    DomElementUtility utility = new DomElementUtility(element);
issueDetails.setAGENCY(utility.getElementContentAsString(SecurityMappingConstants.AGENCY));
    issueDetails.setACCRUALDT(
        TimeConverterUtility.getTargetFormat(
            utility.getElementContentAsString(SecurityMappingConstants.ACCURAL_DT)));
    return issueDetails;
  }
}
