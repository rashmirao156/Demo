package com.deloitte.sample.integration.demo.subscriber.service;

import com.deloitte.sample.integration.demo.subscriber.configuration.TradeSubScriberConfiguration;
import com.deloitte.sample.integration.demo.subscriber.domain.TradehubTrade;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.camel.Handler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.math.BigDecimal;
import java.sql.*;

@Data
@Slf4j
@Component
public class TradehubDeliverTradeService {

  private static final String INSERT =
      "insert into TRADEHUB.TRADES (TRD_NUM, TRD_VER, SETTL_CCY, TXN_TM, LAST_UPDATE_TM, LAST_PX, GROSS_TRD_AMT, TRANS_TYP, CUSIP, FUND, LAST_INSERT_TM, ORIGFACE, SEC_TYPE, PORTFOLIO_NAME) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?) on DUPLICATE KEY UPDATE LAST_UPDATE_TM=VALUES(LAST_UPDATE_TM)";
  private static final String DELETE = "";

  @Qualifier("tradehubDataSource")
  private DataSource tradehubDataSource;

  private String instanceID;

  @Autowired
  public TradehubDeliverTradeService(
      DataSource tradehubDataSource, TradeSubScriberConfiguration propeties) {
    this.tradehubDataSource = tradehubDataSource;
    instanceID = propeties.getInstanceId();
  }

  public TradehubDeliverTradeService() {}

  @Handler
  public void writeToAladdinRawTradesTable(final TradehubTrade tradehubTrade) {
    JdbcTemplate jdbcTemplate1 = new JdbcTemplate(this.tradehubDataSource);
    this.insertIntoAladdinRawTrades(jdbcTemplate1, tradehubTrade);
  }

  protected void insertIntoAladdinRawTrades(
      JdbcTemplate jdbcTemplate, TradehubTrade tradehubTrade) {
    jdbcTemplate.update(con -> generateInsertTradePreparedStatement(con, tradehubTrade));
  }

  protected PreparedStatement generateInsertTradePreparedStatement(
      Connection connection, TradehubTrade tradehubTrade) throws SQLException {
    PreparedStatement query = connection.prepareStatement(INSERT);
    int i = 0;
    query.setBigDecimal(++i, new BigDecimal(tradehubTrade.getTrdNum()));
    query.setString(++i, tradehubTrade.getTrdVer());
    query.setString(++i, tradehubTrade.getSettlCcy());
    query.setString(++i, tradehubTrade.getTxnTm().toString());
    query.setString(++i, new Timestamp(System.currentTimeMillis()).toLocalDateTime().toString());
    query.setBigDecimal(++i, tradehubTrade.getLastPx());
    query.setBigDecimal(++i, tradehubTrade.getGrossTrdAmt());
    query.setString(++i, tradehubTrade.getTransTyp());
    query.setString(++i, tradehubTrade.getCusip());
    query.setString(++i, tradehubTrade.getFund());
    query.setString(++i, new Timestamp(System.currentTimeMillis()).toLocalDateTime().toString());
    query.setBigDecimal(++i, tradehubTrade.getOrigFace());
    query.setString(++i, tradehubTrade.getSecType());
    query.setString(++i, tradehubTrade.getPortfolioName());
    return query;
  }
}
