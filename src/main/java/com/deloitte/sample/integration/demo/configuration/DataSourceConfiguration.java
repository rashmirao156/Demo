package com.deloitte.sample.integration.demo.configuration;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfiguration {

    @Bean(name = "tradehubDataSource")
    @Primary
    @ConfigurationProperties(prefix = "integration.demo.tradehub")
    public DataSource tradehubDataSource(){
        return new HikariDataSource();
    }
}
