package com.deloitte.sample.integration.demo.publisher.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "integration.security.publish.demo")
public class SecurityPublisherConfiguration {
  private String securityPublishInboundJmsUri;
  private String securityPublishOutboundJmsUri;
  private String securityEodPublishInboundJmsUri;
  private String securityEodPublishOutboundJmsUri;
}
