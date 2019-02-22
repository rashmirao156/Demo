package com.deloitte.sample.integration.demo.publisher.transformation.builder.impl;

import com.deloitte.sample.integration.demo.publisher.transformation.builder.SecurityBuilder;
import com.deloitte.sample.integration.demo.publisher.transformation.securitycanon.ASSETS;

import javax.xml.transform.dom.DOMSource;

public class SecurityBuilderImpl implements SecurityBuilder {
  private IssueDetailsBuilder issueDetailsBuilder;
  private DOMSource securitySource;

  public SecurityBuilderImpl(DOMSource securitySource) {
    this.securitySource = securitySource;
    this.issueDetailsBuilder = new IssueDetailsBuilder();
  };

  private ASSETS.ASSET.ISSUEDETAILS setIssueDetails() {
    return issueDetailsBuilder.setIssueDetails(securitySource);
  }

  @Override
  public ASSETS build() {
    ASSETS assets = new ASSETS();
    ASSETS.ASSET asset = new ASSETS.ASSET();
    asset.setISSUEDETAILS(setIssueDetails());
    assets.getASSET().add(asset);
    return assets;
  }
}
