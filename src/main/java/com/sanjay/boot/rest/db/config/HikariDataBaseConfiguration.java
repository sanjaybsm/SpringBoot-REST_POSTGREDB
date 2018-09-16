package com.sanjay.boot.rest.db.config;


import javax.persistence.EntityManagerFactory;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class HikariDataBaseConfiguration {
	
	/*@Bean
	@ConfigurationProperties("spring.datasource")
	public HikariDataSource dataSource() {
		return (HikariDataSource) DataSourceBuilder.create().type(HikariDataSource.class).build();
	}
	*/
	
	@Bean
	public HikariDataSource dataSource() {
		HikariConfig config = new HikariConfig();
		config.setDriverClassName("org.postgresql.Driver");
		config.setJdbcUrl("jdbc:postgresql://localhost:5432/postgres");
		config.setUsername("postgres");
		config.setPassword("admin");
		HikariDataSource datasource = new HikariDataSource(config);
		return datasource;
	}
	
	
	@Bean(name = "entityManagerFactory")
	public EntityManagerFactory entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
		emf.setDataSource(dataSource());
		HibernateJpaVendorAdapter hibernateJpaVendorAdapter = new HibernateJpaVendorAdapter();
		emf.setJpaVendorAdapter(hibernateJpaVendorAdapter);
		emf.setPackagesToScan("com.sanjay.boot.*");
		emf.afterPropertiesSet();
		return emf.getObject();
	}

}
