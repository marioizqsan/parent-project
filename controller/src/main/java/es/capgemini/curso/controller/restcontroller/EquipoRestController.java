package es.capgemini.curso.controller.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.capgemini.curso.modelo.entidad.Equipo;
import es.capgemini.curso.servicio.EquipoService;

@RestController
@RequestMapping("/rest")
public class EquipoRestController {

	@Autowired
	private EquipoService servicio;

	@GetMapping(path = "/equipos", produces = "application/json")
	public List<Equipo> getEquipos() {

		Equipo equipo1 = new Equipo(1, "Real Madrid", "España", "Madrid", "Estadio Santiago Bernabeu", 80000, 150000);
		Equipo equipo2 = new Equipo(2, "F.C. Barcelona", "España", "Barcelona", "Camp Nou", 100000, 170000);
		Equipo equipo3 = new Equipo(3, "Valencia C.F.", "España", "Valencia", "Mestalla", 650000, 120000);

		servicio.agregarEquipo_Service(equipo1);
		servicio.agregarEquipo_Service(equipo2);
		servicio.agregarEquipo_Service(equipo3);
		
		System.out.println(servicio.obtener_todos_los_equipos_Service());

		return servicio.obtener_todos_los_equipos_Service();

	}
	
	@PostMapping(path = "/new", produces = "application/json", consumes = "application/json")
	public void newEquipo(@RequestBody Equipo equipo) {
		servicio.agregarEquipo_Service(equipo);
	}
}
