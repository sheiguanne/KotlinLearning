package com.example.myspringboot.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.sql.DataSource;


/**
 * @ImportResource 通过locations属性加载对应的xml配置文件，必须配合@Configuration注解一起使用，定义为配置类；
 *
 *
 */
@Configuration
@ImportResource("classpath:properties-config.xml")
@EnableJpaRepositories(transactionManagerRef = "imonitorTrasactionManager",
        entityManagerFactoryRef = "imonitorEntityManagerFactory",
        basePackages = "com.example.myspringboot.model")
public class JDBCConfig {

    @Autowired
    private Environment env;

    @Bean(name = "dataSource")
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(env.getProperty("spring.datasource.druid.url"));
        dataSource.setUsername(env.getProperty("spring.datasource.druid.username"));
        dataSource.setPassword(env.getProperty("spring.datasource.druid.password"));
        return dataSource;
    }
}

