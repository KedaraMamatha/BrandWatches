package com.backend.configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.backend.model.CategoryModel;
import com.backend.model.ProductModel;
import com.backend.model.SupplierModel;
import com.backend.model.UsersModel;

@Configuration
@EnableTransactionManagement
@ComponentScan("com")
public class ApplicationConfig {
	
	@Autowired
	@Bean(name="dataSource")
	public DataSource getDataSource()
	{
		DriverManagerDataSource driverManagerDataSource=new DriverManagerDataSource();
		driverManagerDataSource.setUsername("system");
		driverManagerDataSource.setPassword("system");
		driverManagerDataSource.setDriverClassName("org.h2.Driver");
		driverManagerDataSource.setUrl("jdbc:h2:tcp://localhost/~/project1");
		return driverManagerDataSource;
	}
	private Properties getProperties()
	{
		Properties properties=new Properties();
		properties.setProperty("hibernate.show_sql", "true");
		properties.setProperty(	"hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		properties.setProperty("hibernate.hbm2ddl.auto", "update");
		return properties;
	}
	@Autowired
	@Bean(name="sessionFactory")
 public SessionFactory getSessionFactory(DataSource dataSource)	{
	LocalSessionFactoryBuilder localSessionFactoryBuilder= new LocalSessionFactoryBuilder(dataSource);
	localSessionFactoryBuilder.addProperties(getProperties());
	 localSessionFactoryBuilder.addAnnotatedClasses(UsersModel.class);
	 localSessionFactoryBuilder.addAnnotatedClasses(ProductModel.class);
	 	localSessionFactoryBuilder.addAnnotatedClasses(CategoryModel.class);
	 		localSessionFactoryBuilder.addAnnotatedClasses(SupplierModel.class);
	return localSessionFactoryBuilder.buildSessionFactory();	
	}
	@Autowired
	@Bean(name="transactionManager")
	public HibernateTransactionManager geTransactionManager(SessionFactory sessionFactory)
	{
		HibernateTransactionManager hibernateTransactionManager=new HibernateTransactionManager(sessionFactory);
		return hibernateTransactionManager;
		
	}
}
