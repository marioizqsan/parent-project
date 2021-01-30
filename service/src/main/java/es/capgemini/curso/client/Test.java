package es.capgemini.curso.client;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import es.capgemini.curso.config.AppConfig;
import es.capgemini.curso.modelo.entidad.Equipo;
import es.capgemini.curso.modelo.repository.EquipoRepository;
import es.capgemini.curso.servicio.EquipoService;
import es.capgemini.curso.servicio.EquipoServiceImpl;

public class Test {

	public static void main(String[] args) {
		
		// Carga contexto de Spring basado en anotaciones
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		// Recuperar instancia del repositorio
		EquipoRepository repo = (EquipoRepository) context.getBean(EquipoRepository.class);
		
		Equipo equipo1 = new Equipo("Real Madrid", "España", "Madrid", "Estadio Santiago Bernabeu", 80000, 150000);
		Equipo equipo2 = new Equipo("F.C. Barcelona", "España", "Barcelona", "Camp Nou", 100000, 170000);
		Equipo equipo3 = new Equipo("Valencia C.F.", "España", "Valencia", "Mestalla", 650000, 120000);
		
		// Ejecutar metodos de negocio del repositorio
		repo.save(equipo1);
		repo.save(equipo2);
		repo.save(equipo3);
		
		// Mostrar contenido base de datos
		System.out.println("Todos los equipos del sistema: ");
		System.out.println("\n" + repo.findAll());
		
		System.out.println("Obtener equipo Real Madrid: ");
		System.out.println("\n" + repo.findOne(1));
		
		System.out.println("Eliminar Valencia: ");
		repo.delete(equipo3);
		System.out.println("Equipos totales: ");
		System.out.println(repo.findAll());
		
		System.out.println("Modificar Barcelona: ");
		equipo2.setEstadio("Nuevo Camp Nou");
		repo.save(equipo2);
		System.out.println("Equipos totales: ");
		System.out.println(repo.findAll());
		
		
		
		// Cerrar y liberar contexto de Spring
		context.close();
		
	}
}
