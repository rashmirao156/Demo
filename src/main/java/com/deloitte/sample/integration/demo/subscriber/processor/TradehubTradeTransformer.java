package com.deloitte.sample.integration.demo.subscriber.processor;

import com.deloitte.sample.integration.demo.publisher.transformation.fixml.FIXML;
import com.deloitte.sample.integration.demo.publisher.transformation.fixml.InstrumentBlockT;
import com.deloitte.sample.integration.demo.publisher.transformation.fixml.TradeCaptureReportMessageT;
import com.deloitte.sample.integration.demo.publisher.transformation.fixml.TrdCapRptSideGrpBlockT;
import com.deloitte.sample.integration.demo.subscriber.domain.TradehubTrade;
import lombok.extern.slf4j.Slf4j;
import org.apache.camel.Handler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.math.BigInteger;

@Slf4j
@Component
public class TradehubTradeTransformer {

  private DataSource tradehubDataSource;

  @Autowired
  public TradehubTradeTransformer(DataSource tradehubDataSource) {
    this.tradehubDataSource = tradehubDataSource;
  }

  @Handler
  public TradehubTrade transform(FIXML fixml) {
    TradehubTrade tradehubTrade = new TradehubTrade();
    // Sourced From: FIXML/TrdCptRpt
    TradeCaptureReportMessageT tradeCaptureReport =
        (TradeCaptureReportMessageT) fixml.getMessage().getValue();
    tradehubTrade.setGrossTrdAmt(tradeCaptureReport.getGrossTrdAmt());
    tradehubTrade.setLastPx(tradeCaptureReport.getLastPx());
    tradehubTrade.setLastUpdateTm(
        tradeCaptureReport.getLastUpdateTm() == null
            ? ""
            : tradeCaptureReport.getLastUpdateTm().toString());
    tradehubTrade.setSettlCcy(tradeCaptureReport.getSettlCcy());
    tradehubTrade.setTrdDt(
        tradeCaptureReport.getTrdDt() == null ? "" : tradeCaptureReport.getTrdDt().toString());
    tradehubTrade.setTrdNum(tradeCaptureReport.getTrdNum());
    tradehubTrade.setTrdVer(
        tradeCaptureReport.getTrdVer() == null ? "" : tradeCaptureReport.getTrdVer());
    tradehubTrade.setTxnTm(
        tradeCaptureReport.getTxnTm() == null ? "" : tradeCaptureReport.getTxnTm().toString());

    // Setting ORIGFACE
    if (!tradeCaptureReport.getAmt().isEmpty()) {
      tradeCaptureReport
          .getAmt()
          .forEach(
              s -> {
                if (s != null && s.getTyp().equals("ORIG")) {
                  tradehubTrade.setOrigFace(s.getAmt());
                }
              });
    }

    // Setting CUSIP
    InstrumentBlockT instrumentBlockT = tradeCaptureReport.getInstrmt();
    tradehubTrade.setCusip(instrumentBlockT.getID());

    // Setting SEC_TYPE
    tradehubTrade.setSecType(instrumentBlockT.getSecTyp());

    // Setting FUND
    TrdCapRptSideGrpBlockT trdCapRptSideGrpBlockT =
        (tradeCaptureReport.getRptSide() == null) ? null : tradeCaptureReport.getRptSide().get(0);

    if (trdCapRptSideGrpBlockT != null) {
      // Setting TRAN_TYPE
      tradehubTrade.setTransTyp(trdCapRptSideGrpBlockT.getFirmTrdEvntID());

      // Setting PORTFOLIO_NAME
      tradehubTrade.setPortfolioName(trdCapRptSideGrpBlockT.getAcct());
      trdCapRptSideGrpBlockT
          .getPty()
          .forEach(
              s -> {
                if (s.getR().equals(new BigInteger("38")) && (s.getSrc().equals("D"))) {
                  tradehubTrade.setFund(s.getID());
                }
              });
    }

    return tradehubTrade;
  }
}
