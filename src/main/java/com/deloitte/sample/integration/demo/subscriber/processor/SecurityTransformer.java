package com.deloitte.sample.integration.demo.subscriber.processor;

import com.deloitte.sample.integration.demo.publisher.transformation.securitycanon.ASSETS;
import com.deloitte.sample.integration.demo.subscriber.domain.IssueDetails;
import lombok.extern.slf4j.Slf4j;
import org.apache.camel.Handler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Component
public class SecurityTransformer {

  @Qualifier("securityDataSource")
  private DataSource securityDataSource;

  @Autowired
  public SecurityTransformer(DataSource securityDataSource) {
    this.securityDataSource = securityDataSource;
  }

  @Handler
  public List<IssueDetails> transform(ASSETS assets) {
    List<ASSETS.ASSET> assetList = new ArrayList<>();
    List<IssueDetails> issueDetailsList = new ArrayList<>();
    assetList = assets.getASSET();
    for (ASSETS.ASSET assetObj : assetList) {
      ASSETS.ASSET.ISSUEDETAILS issueDetails = assetObj.getISSUEDETAILS();
      IssueDetails issueDetailsModel = new IssueDetails();
      issueDetailsModel.setAccuralDt(issueDetails.getACCRUALDT().toString());
      issueDetailsModel.setAgency(issueDetails.getAGENCY());
      issueDetailsList.add(issueDetailsModel);
    }
    return issueDetailsList;
  }
}
