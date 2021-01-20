package es.capgemini.curso.client;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import es.capgemini.curso.config.AppConfig;
import es.capgemini.curso.controller.EquipoController;
import es.capgemini.curso.modelo.entidad.Equipo;

public class Test {

	public static void main(String[] args) {
		
		// Carga contexto de Spring basado en anotaciones
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		// Recuperar componente de negocio (bean) por id
		EquipoController component = (EquipoController) context.getBean("equipo_controller");
		
		Equipo equipo1 = new Equipo("Real Madrid", "España", "Madrid", "Estadio Santiago Bernabeu", 80000, 150000);
		Equipo equipo2 = new Equipo("F.C. Barcelona", "España", "Barcelona", "Camp Nou", 100000, 150000);
		
		// Ejecutar metodos de negocio de EquipoController
		component.agregarEquipo_ControllerComponent(equipo1);
		component.agregarEquipo_ControllerComponent(equipo2);
		
		List<Equipo> lista_equipos = component.obtener_todos_los_equipos_ControllerComponent();
		System.out.println("\n\n" + lista_equipos.get(0).toString());
		System.out.println("\n\n" + lista_equipos.get(1).toString());
		
		// Cerrar contexto de Spring
		context.close();
		
	}
}
