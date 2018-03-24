package com.baeldung.flywaycallbacks;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

@Configuration
public class FlywayCallbackTestConfig {

    @Bean
    public DataSource createDatasource() {
        
    		DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://192.168.43.95:3306/flyway_demo_test?useSSL=false");
        dataSource.setUsername("root");
        dataSource.setPassword("kol");
 
        return dataSource;
    		
    }

}
