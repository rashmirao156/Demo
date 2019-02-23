package com.deloitte.sample.integration.demo.adapter.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "integration.adapter.demo")
public class AdapterConfiguration {

  private String adpTradeInboundQueueUri;
  private String adpTradeOutboundQueueUri;

  private String adpSecurityInboundQueueUri;
  private String adpSecurityOutboundQueueUri;
}
