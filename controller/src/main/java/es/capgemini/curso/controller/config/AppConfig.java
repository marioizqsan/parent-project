package es.capgemini.curso.controller.config;

import javax.persistence.EntityManagerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/*Configuracion componentes NO web aplicacion Spring MVC
 * Clase de configuracion de Spring donde:
 * Habilitamos los repositorios JPA con @EnableJpaRepositories
 * Habilitamos el escaneo de componentes con @ComponentScan
 * Habilitamos la gestion de transacciones con @EnableTransactionManagement 
 */
@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages = { "es.capgemini.curso.servicio", "es.capgemini.curso.modelo" })
@EnableJpaRepositories(basePackages = { "es.capgemini.curso.modelo.repository" })
public class AppConfig {

	@Bean
	public LocalEntityManagerFactoryBean entityManagerFactory() {
		LocalEntityManagerFactoryBean factory = new LocalEntityManagerFactoryBean();

		/*
		 * Cargar la unidad de persistencia del fichero persistence.xml
		 * 
		 */
		factory.setPersistenceUnitName("jpa-h2");

		return factory;
	}

	@Bean
	public JpaTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
		JpaTransactionManager txManager = new JpaTransactionManager();

		txManager.setEntityManagerFactory(entityManagerFactory);

		return txManager;
	}
}
