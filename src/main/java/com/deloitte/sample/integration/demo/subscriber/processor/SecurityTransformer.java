package com.deloitte.sample.integration.demo.subscriber.processor;

import com.deloitte.sample.integration.demo.publisher.transformation.securitycanon.ASSETS;
import com.deloitte.sample.integration.demo.subscriber.domain.Security;
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
  public List<Security> transform(ASSETS assets) {
    List<ASSETS.ASSET> assetList = new ArrayList<>();
    List<Security> securityList = new ArrayList<>();
    assetList = assets.getASSET();
    for (ASSETS.ASSET assetObj : assetList) {
      ASSETS.ASSET.ISSUEDETAILS issueDetails = assetObj.getISSUEDETAILS();
      ASSETS.ASSET.SECURITYIDENTIFIERS securityidentifiers = assetObj.getSECURITYIDENTIFIERS();
      Security securityModel = new Security();
      securityModel.setAccuralDt(issueDetails.getACCRUALDT().toString());
      securityModel.setAgency(issueDetails.getAGENCY());
      securityModel.setCusip(securityidentifiers.getCUSIP());
      securityList.add(securityModel);
    }
    return securityList;
  }
}
