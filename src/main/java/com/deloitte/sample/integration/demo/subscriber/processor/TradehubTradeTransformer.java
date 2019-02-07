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

import javax.sql.DataSource;
import java.math.BigDecimal;
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
    public TradehubTrade transform(/*FIXML fixml, @Header(Exchange.BREADCRUMB_ID) UUID trackingID, @Header("comments") String comments*/){
        TradehubTrade tradehubTrade = new TradehubTrade();
        /*if(!comments.isEmpty())
            tradehubTrade.setComments(comments);

        tradehubTrade.setInputId(BRS_INPUT_ID);
        tradehubTrade.setExchRateMultiDivInd(EXCHANGE_RATE_MULT_DIV_INDICATOR);

        // Sourced From: FIXML/TrdCptRpt
        TradeCaptureReportMessageT tradeCaptureReport = (TradeCaptureReportMessageT)fixml.getMessage().getValue();

        // Sourced From: FIXML/TrdCptRpt/Instrmt
        InstrumentBlockT instrumentBlock = tradeCaptureReport.getInstrmt();

        // Sourced From: FIXML/TrdCptRpt/RptSide
        TrdCapRptSideGrpBlockT rptSideGrpBlock = tradeCaptureReport.getRptSide().get(0);

        // Sourced From: FIXML/RptSide/SettleDetails
*/
        tradehubTrade.setAccruedInt(new BigDecimal(12.12));
        tradehubTrade.setAccruedIntDays(new BigDecimal(12.12));

        return tradehubTrade;


    }
}
