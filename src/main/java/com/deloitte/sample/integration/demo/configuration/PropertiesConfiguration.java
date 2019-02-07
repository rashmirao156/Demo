package com.deloitte.sample.integration.demo.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "integration.demo")
public class PropertiesConfiguration {

    private String portfolioCOdeKey;
    private String jmsInboundRouteUri;
    private String jmsInboundRouteOptions;
    private String instanceId;

    public String getJmsInboundGatewayUri(){ return buildUri(jmsInboundRouteUri,jmsInboundRouteOptions );}

    private String buildUri(String base , String options){
        if (options == null || options.isEmpty()){
            return base;
        }
        return base.startsWith("?") ? base + options : base + "?" + options;
    }
}
