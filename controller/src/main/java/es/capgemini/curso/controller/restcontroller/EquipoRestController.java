package es.capgemini.curso.controller.restcontroller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

	@GetMapping("/equipos")
	public List<Equipo> teams() {
		return servicio.obtener_todos_los_equipos_Service();
	}

	@GetMapping("/equipos/{id}")
	public Optional<Equipo> getTeam(@PathVariable("id") int id) {
		return servicio.obtener_un_equipo_Service(id);
	}

	@PostMapping("/new")
	public void newTeam(@RequestBody Equipo equipo) {
		servicio.agregarEquipo_Service(equipo);
	}

	@PutMapping("/equipos/{id}")
	public void updateTeam(@PathVariable("id") int id, @RequestBody Equipo equipo) {
		Optional<Equipo> equipo_a_modificar = servicio.obtener_un_equipo_Service(id);
		if (equipo_a_modificar.isPresent()) {
			equipo_a_modificar.get().setNombre(equipo.getNombre());
			equipo_a_modificar.get().setCiudad(equipo.getCiudad());
			equipo_a_modificar.get().setPais(equipo.getPais());
			equipo_a_modificar.get().setEstadio(equipo.getEstadio());
			equipo_a_modificar.get().setAforo(equipo.getAforo());
			equipo_a_modificar.get().setNumero_socios(equipo.getNumero_socios());

			servicio.modificarEquipo_Service(equipo_a_modificar.get());
		}

	}

	@DeleteMapping("/equipos/{id}")
	public void deleteTeam(@PathVariable("id") int id) {
		Optional<Equipo> equipo_a_eliminar = servicio.obtener_un_equipo_Service(id);
		if (equipo_a_eliminar.isPresent()) {
			servicio.eliminarEquipo_Service(equipo_a_eliminar.get());
		}
	}
}
