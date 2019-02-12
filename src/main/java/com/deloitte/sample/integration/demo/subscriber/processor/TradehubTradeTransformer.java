package com.deloitte.sample.integration.demo.subscriber.processor;

import com.deloitte.sample.integration.demo.subscriber.domain.TradehubTrade;
import com.deloitte.sample.integration.demo.transformation.fixml.FIXML;
import com.deloitte.sample.integration.demo.transformation.fixml.TradeCaptureReportMessageT;
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
    tradehubTrade.setTransTyp(
        tradeCaptureReport.getTransTyp() == null
            ? BigInteger.valueOf(0)
            : tradeCaptureReport.getTransTyp());
    tradehubTrade.setTrdDt(
        tradeCaptureReport.getTrdDt() == null ? "" : tradeCaptureReport.getTrdDt().toString());
    tradehubTrade.setTrdNum(tradeCaptureReport.getTrdNum());
    tradehubTrade.setTrdVer(
        tradeCaptureReport.getTrdVer() == null ? "" : tradeCaptureReport.getTrdVer());
    tradehubTrade.setTxnTm(
        tradeCaptureReport.getTxnTm() == null ? "" : tradeCaptureReport.getTxnTm().toString());
    return tradehubTrade;
  }
}
