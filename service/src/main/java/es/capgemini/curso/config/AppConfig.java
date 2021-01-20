package es.capgemini.curso.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import es.capgemini.curso.controller.EquipoController;

/*
 * Clase de configuracion de Spring
 */
@Configuration

/*
 * Habilitar el escaneo de componentes de Spring especificando el paquete base de búsqueda
 */
@ComponentScan(basePackages = {"es.capgemini.curso"})
public class AppConfig {

	/*
	 * Método de factoría para creación del bean (objeto de Spring)
	 */
	@Bean(name = "equipo_controller")
	public EquipoController componente_controlador() {
		return new EquipoController();
	}
}
