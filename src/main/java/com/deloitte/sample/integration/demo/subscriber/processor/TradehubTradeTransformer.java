package com.deloitte.sample.integration.demo.subscriber.processor;

import com.deloitte.sample.integration.demo.subscriber.domain.TradehubTrade;
import com.deloitte.sample.integration.demo.transformation.fixml.FIXML;
import com.deloitte.sample.integration.demo.transformation.fixml.InstrumentBlockT;
import com.deloitte.sample.integration.demo.transformation.fixml.TradeCaptureReportMessageT;
import com.deloitte.sample.integration.demo.transformation.fixml.TrdCapRptSideGrpBlockT;
import lombok.extern.slf4j.Slf4j;
import org.apache.camel.Exchange;
import org.apache.camel.Handler;
import org.apache.camel.Header;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.sql.DataSource;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

@Slf4j
@Component
public class TradehubTradeTransformer {
    public static final String PARTY_CCP_RINDEX = "4";
    private static final String BRS_INPUT_ID = "BRS";
    private static final String EXCHANGE_RATE_MULT_DIV_INDICATOR = "M";

    private  DataSource tradehubDataSource ;

    @Autowired
    public TradehubTradeTransformer(DataSource tradehubDataSource){
        this.tradehubDataSource = tradehubDataSource ;
    }

    @Handler
    public TradehubTrade transform(FIXML fixml){
        TradehubTrade tradehubTrade = new TradehubTrade();
        // Sourced From: FIXML/TrdCptRpt
        TradeCaptureReportMessageT tradeCaptureReport = (TradeCaptureReportMessageT)fixml.getMessage().getValue();
        tradehubTrade.setGrossTrdAmt(tradeCaptureReport.getGrossTrdAmt());
        tradehubTrade.setLastPx(tradeCaptureReport.getLastPx());
        tradehubTrade.setLastUpdateTm(tradeCaptureReport.getLastUpdateTm() == null ? "" : tradeCaptureReport.getLastUpdateTm().toString());
        tradehubTrade.setSettlCcy(tradeCaptureReport.getSettlCcy());
        tradehubTrade.setTransTyp(tradeCaptureReport.getTransTyp() == null ? BigInteger.valueOf(0) : tradeCaptureReport.getTransTyp());
        tradehubTrade.setTrdDt(tradeCaptureReport.getTrdDt().toString());
        tradehubTrade.setTrdNum(tradeCaptureReport.getTrdNum() );
        tradehubTrade.setTrdVer(tradeCaptureReport.getTrdVer() == null ? "" : tradeCaptureReport.getTrdVer());
        tradehubTrade.setTxnTm(tradeCaptureReport.getTxnTm() == null ? "" : tradeCaptureReport.getTxnTm().toString());

        // Sourced From: FIXML/TrdCptRpt/Instrmt
        InstrumentBlockT instrumentBlock = tradeCaptureReport.getInstrmt();

        // Sourced From: FIXML/TrdCptRpt/RptSide
        TrdCapRptSideGrpBlockT rptSideGrpBlock = tradeCaptureReport.getRptSide().get(0);

        // Sourced From: FIXML/RptSide/SettleDetails

        return tradehubTrade;


    }
}
