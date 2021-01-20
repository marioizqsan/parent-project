package es.capgemini.curso.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.capgemini.curso.modelo.dao.EquipoDao;
import es.capgemini.curso.modelo.entidad.Equipo;

/*
 * Componente para la capa de servicios con dependencia de la capa de acceso a datos (DAO)
 */
@Service
public class EquipoServiceImpl implements EquipoService {

	// Dependencia a la capa del modelo inyectada por el contenedor de Spring
	@Autowired
	private EquipoDao dao;

	@Override
	public void agregarEquipo_Service(Equipo equipo) {
		dao.agregarEquipo(equipo);

	}

	@Override
	public void eliminarEquipo_Service(String nombreEquipo) {
		dao.eliminarEquipo(nombreEquipo);

	}

	@Override
	public Equipo obtener_un_equipo_Service(String nombre) {
		return dao.obtener_un_equipo(nombre);
	}

	@Override
	public List<Equipo> obtener_todos_los_equipos_Service() {
		return dao.obtener_todos_los_equipos();
	}

}
