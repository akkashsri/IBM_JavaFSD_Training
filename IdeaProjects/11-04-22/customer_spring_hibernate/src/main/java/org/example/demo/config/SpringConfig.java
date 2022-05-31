package org.example.demo.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@ComponentScan(basePackages = "org.example.demo")
public class SpringConfig {

    @Bean(name = "sf")
    public LocalSessionFactoryBean sessionFactory() {
        LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
        sessionFactoryBean.setPackagesToScan("org.example.demo.entity");
        sessionFactoryBean.setDataSource(dataSource());
        sessionFactoryBean.setHibernateProperties(hibernateProperties());

        return sessionFactoryBean;
    }

    @Bean
    public DataSource dataSource() {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/cs_db");
        dataSource.setUser("root");
        dataSource.setPassword("root");
        dataSource.setMaxPoolSize(20);
        dataSource.setMinPoolSize(5);
        dataSource.setMaxIdleTime(30000);

        return dataSource;
    }

    @Bean
    public PlatformTransactionManager platformTransactionManager() {
        HibernateTransactionManager hibernateTransactionManager = new HibernateTransactionManager();
        hibernateTransactionManager.setSessionFactory(sessionFactory().getObject());

        return hibernateTransactionManager;
    }

    private Properties hibernateProperties() {
        Properties hibernateProperties = new Properties();
        hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "update");
        hibernateProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");

        return hibernateProperties;
    }
}
