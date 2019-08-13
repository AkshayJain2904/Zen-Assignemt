package com.zensar;

import java.io.IOException;
import java.util.Properties;
import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class,DataSourceTransactionManagerAutoConfiguration.class,
HibernateJpaAutoConfiguration.class})
public class SpringBootProductRestServiceApplication {

	@Autowired
	private Environment environment;
	
	public static void main(String[] args) {
		
		SpringApplication.run(SpringBootProductRestServiceApplication.class, args);
		System.out.println("Hello");
	}
	@Autowired
	@Bean(name = "dataSource")
	public DataSource  getDataSource() {
		DriverManagerDataSource driverManagerDataSource=new DriverManagerDataSource();
		driverManagerDataSource.setDriverClassName(environment.getProperty("spring.datasource.driver-class-name"));
		driverManagerDataSource.setUrl(environment.getProperty("spring.datasource.url"));
		driverManagerDataSource.setUsername(environment.getProperty("spring.datasource.username"));
		driverManagerDataSource.setPassword(environment.getProperty("spring.datasource.password"));
		System.out.println("##getdatasource"+driverManagerDataSource);
		return driverManagerDataSource;
	}
	@Autowired
	@Bean(name = "sessionFactory")
	public SessionFactory getSessionFactory(DataSource dataSource) throws IOException
	{
		Properties properties=new Properties();
		properties.put("hibernatedialect", environment.getProperty("spring.jpa.properties.hibernate.dialect"));
		properties.put("hibernate.show_sql", environment.getProperty("spring.jpa.show-sql"));
		
		LocalSessionFactoryBean localSessionFactoryBean=new LocalSessionFactoryBean();
		localSessionFactoryBean.setPackagesToScan(new String[] {"com.zensar.entites"});
		localSessionFactoryBean.setDataSource(dataSource);
		localSessionFactoryBean.setHibernateProperties(properties);
		localSessionFactoryBean.afterPropertiesSet();
		SessionFactory sessionFactory=localSessionFactoryBean.getObject();
		System.out.println("## get session factory"+sessionFactory);
		return sessionFactory;
	}
	@Autowired
	@Bean(name = "hibernateTemplate")
	public HibernateTemplate getHibernateTemplate(SessionFactory sessionFactory) {
		HibernateTemplate hibernateTemplate=new HibernateTemplate(sessionFactory);
		return hibernateTemplate;
	}
	
	@Autowired
	@Bean(name = "transacationManager")
	public HibernateTransactionManager getHibernateTransactionManager(SessionFactory sessionFactory) {
		HibernateTransactionManager hibernateTransactionManager=new HibernateTransactionManager(sessionFactory);
		return hibernateTransactionManager;
	}
	
	

}
