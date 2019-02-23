package com.deloitte.sample.integration.demo.publisher.transformation.builder.impl;

import com.deloitte.sample.integration.demo.publisher.transformation.builder.SecurityBuilder;
import com.deloitte.sample.integration.demo.publisher.transformation.securitycanon.ASSETS;

import javax.xml.transform.dom.DOMSource;

public class SecurityBuilderImpl implements SecurityBuilder {
  private IssueDetailsBuilder issueDetailsBuilder;
  private SecurityIdentifierBuilder securityIdentifierBuilder;

  private DOMSource securitySource;

  public SecurityBuilderImpl(DOMSource securitySource) {
    this.securitySource = securitySource;
    this.issueDetailsBuilder = new IssueDetailsBuilder();
    this.securityIdentifierBuilder = new SecurityIdentifierBuilder();
  };

  private ASSETS.ASSET.ISSUEDETAILS setIssueDetails() {
    return issueDetailsBuilder.setIssueDetails(securitySource);
  }

  private ASSETS.ASSET.SECURITYIDENTIFIERS setSecurityIdentifiers() {
    return securityIdentifierBuilder.setSecurityIdentifiers(securitySource);
  }

  @Override
  public ASSETS build() {
    ASSETS assets = new ASSETS();
    ASSETS.ASSET asset = new ASSETS.ASSET();
    asset.setISSUEDETAILS(setIssueDetails());
    asset.setSECURITYIDENTIFIERS(setSecurityIdentifiers());
    assets.getASSET().add(asset);
    return assets;
  }
}
