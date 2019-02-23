package com.deloitte.sample.integration.demo.subscriber.service;

import com.deloitte.sample.integration.demo.subscriber.configuration.SecuritySubscriberConfiguration;
import com.deloitte.sample.integration.demo.subscriber.domain.Security;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.camel.Handler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Data
@Slf4j
@Component
public class SecurityService {

  private static final String INSERT =
      "insert into MARKITEDM.ISSUE_DETAILS (ACCURAL_DT, AGENCY,CUSIP) values (?,?,?) on DUPLICATE KEY UPDATE ACCURAL_DT=VALUES(ACCURAL_DT),AGENCY=VALUES(AGENCY)";
  private static final String DELETE = "";

  @Qualifier("securityDataSource")
  private DataSource securityDataSource;

  private String instanceID;

  @Autowired
  public SecurityService(
          DataSource securityDataSource, SecuritySubscriberConfiguration propeties) {
    this.securityDataSource = securityDataSource;
    instanceID = propeties.getInstanceId();
  }

  public SecurityService() {}

  @Handler
  public void writeToIssueDetailsTable(final Security security) {
    JdbcTemplate jdbcTemplate1 = new JdbcTemplate(this.securityDataSource);
    this.insertIntoIssueDetails(jdbcTemplate1, security);
  }

  protected void insertIntoIssueDetails(
      JdbcTemplate jdbcTemplate, Security security) {
    jdbcTemplate.update(con -> generateInsertSecurityPreparedStatement(con, security));
  }

  protected PreparedStatement generateInsertSecurityPreparedStatement(
      Connection connection, Security security) throws SQLException {
    PreparedStatement query = connection.prepareStatement(INSERT);
    int i = 0;
    query.setString(++i, security.getAccuralDt());
    query.setString(++i, security.getAgency());
    query.setString(++i, security.getCusip());


    return query;
  }
}
