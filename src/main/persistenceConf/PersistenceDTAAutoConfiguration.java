package com.api.api_request.persistenceConf;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@PropertySource({ "classpath:application.properties" })
@EnableJpaRepositories(basePackages = "package com.api.api_request.repository", entityManagerFactoryRef = "DTAEntityManager", transactionManagerRef = "DTATransactionManager")
public class PersistenceDTAAutoConfiguration {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource DTADataSource() {
        return DataSourceBuilder.create().build();
    }
}
