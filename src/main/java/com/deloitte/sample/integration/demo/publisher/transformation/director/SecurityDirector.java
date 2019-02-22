package com.deloitte.sample.integration.demo.publisher.transformation.director;

import com.deloitte.sample.integration.demo.publisher.transformation.builder.SecurityBuilder;
import com.deloitte.sample.integration.demo.publisher.transformation.securitycanon.ASSETS;

public class SecurityDirector {
  private SecurityBuilder securityBuilder;

  public SecurityDirector(SecurityBuilder securityBuilder) {
    this.securityBuilder = securityBuilder;
  }

  public ASSETS construct() {

    return securityBuilder.build();
  }
}
