package com.deloitte.sample.integration.demo.subscriber.service;

import com.deloitte.sample.integration.demo.subscriber.configuration.SecuritySubscriberConfiguration;
import com.deloitte.sample.integration.demo.subscriber.domain.IssueDetails;
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
      "insert into MARKITEDM.ISSUE_DETAILS (ACCURAL_DT, AGENCY) values (?,?)";
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
  public void writeToIssueDetailsTable(final IssueDetails issueDetails) {
    JdbcTemplate jdbcTemplate1 = new JdbcTemplate(this.securityDataSource);
    this.insertIntoIssueDetails(jdbcTemplate1, issueDetails);
  }

  protected void insertIntoIssueDetails(
      JdbcTemplate jdbcTemplate, IssueDetails issueDetails) {
    jdbcTemplate.update(con -> generateInsertSecurityPreparedStatement(con, issueDetails));
  }

  protected PreparedStatement generateInsertSecurityPreparedStatement(
      Connection connection, IssueDetails issueDetails) throws SQLException {
    PreparedStatement query = connection.prepareStatement(INSERT);
    int i = 0;
    query.setString(++i, issueDetails.getAccuralDt());
    query.setString(++i, issueDetails.getAgency());

    return query;
  }
}
