package com.deloitte.sample.integration.demo.subscriber.service;

import com.deloitte.sample.integration.demo.configuration.PropertiesConfiguration;
import com.deloitte.sample.integration.demo.subscriber.domain.TradehubTrade;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.camel.Handler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Data
@Slf4j
@Component
public class TradehubDeliverTradeService {

    private static final String INSERT = "insert into TRADEHUB.ALADDIN_RAW_TRADES (TRD_NUM, TRD_VER, SETTL_CCY, TXN_TM, LAST_UPDATE_TM, LAST_PX, GROSS_TRD_AMT, TRANS_TYP, TRD_DT) values (?,?,?,?,?,?,?,?,?)";
    private static final String DELETE = "";

    private DataSource tradehubDataSource ;

    private String instanceID;

    @Autowired
    public TradehubDeliverTradeService(DataSource tradehubDataSource, PropertiesConfiguration propeties){
        this.tradehubDataSource = tradehubDataSource;
        instanceID = propeties.getInstanceId();
    }

    public TradehubDeliverTradeService(){

    }

    @Handler
    public void writeToAladdinRawTradesTable(final TradehubTrade tradehubTrade){
        JdbcTemplate jdbcTemplate1 = new JdbcTemplate(this.tradehubDataSource);
        this.insertIntoAladdinRawTrades(jdbcTemplate1,tradehubTrade);
    }

    protected  void insertIntoAladdinRawTrades(JdbcTemplate jdbcTemplate, TradehubTrade tradehubTrade){
        jdbcTemplate.update(con -> generateInsertTradePreparedStatement(con,tradehubTrade));
    }


    protected PreparedStatement generateInsertTradePreparedStatement(Connection connection, TradehubTrade tradehubTrade) throws SQLException {
        PreparedStatement query = connection.prepareStatement(INSERT);
        int i = 0;
        query.setBigDecimal(++i, new BigDecimal(tradehubTrade.getTrdNum()));
        query.setString(++i, tradehubTrade.getTrdVer());
        query.setString(++i, tradehubTrade.getSettlCcy());
        query.setString(++i, tradehubTrade.getTxnTm().toString());
        query.setString(++i, tradehubTrade.getLastUpdateTm().toString());
        query.setBigDecimal(++i, tradehubTrade.getLastPx());
        query.setBigDecimal(++i, tradehubTrade.getGrossTrdAmt());
        query.setBigDecimal(++i, new BigDecimal(tradehubTrade.getTransTyp()));
        query.setString(++i, tradehubTrade.getTrdDt());
        return query;
    }



}
