package es.capgemini.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import es.capgemini.curso.modelo.entidad.Equipo;
import es.capgemini.curso.servicio.EquipoService;

/*
 * Componente para la capa de negocio
 */
@Component
public class EquipoController {
	
	// Dependencia a la capa de servicio inyectada por el contenedor de Spring
	@Autowired
	EquipoService service;
	
	/*
	 * Método de negocio
	 */
	public void agregarEquipo_ControllerComponent(Equipo equipo) {
		service.agregarEquipo_Service(equipo);
	}
	
	/*
	 * Método de negocio
	 */
	public List<Equipo> obtener_todos_los_equipos_ControllerComponent(){
		return service.obtener_todos_los_equipos_Service();
	}

}
