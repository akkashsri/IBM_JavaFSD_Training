package org.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = "org.example.demo")
public class SpringConfig {

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/cs_db");
        driverManagerDataSource.setUsername("root");
        driverManagerDataSource.setPassword("root");
        return driverManagerDataSource;
    }
}
