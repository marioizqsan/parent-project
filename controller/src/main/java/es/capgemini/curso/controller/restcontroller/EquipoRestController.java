package es.capgemini.curso.controller.restcontroller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import es.capgemini.curso.modelo.entidad.Equipo;
import es.capgemini.curso.servicio.EquipoServiceImpl;

@RestController
@RequestMapping("/equipos")
public class EquipoRestController {

	@Autowired
	private EquipoServiceImpl servicio;

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Equipo> getEquipos() {

		Equipo equipo1 = new Equipo("Real Madrid", "España", "Madrid", "Estadio Santiago Bernabeu", 80000, 150000);
		Equipo equipo2 = new Equipo("F.C. Barcelona", "España", "Barcelona", "Camp Nou", 100000, 170000);
		Equipo equipo3 = new Equipo("Valencia C.F.", "España", "Valencia", "Mestalla", 650000, 120000);

		servicio.agregarEquipo_Service(equipo1);
		servicio.agregarEquipo_Service(equipo2);
		servicio.agregarEquipo_Service(equipo3);

		return servicio.obtener_todos_los_equipos_Service();
	}

}
