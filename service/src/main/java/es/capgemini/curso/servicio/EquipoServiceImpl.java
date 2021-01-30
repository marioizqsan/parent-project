package es.capgemini.curso.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.capgemini.curso.modelo.repository.EquipoRepository;
import es.capgemini.curso.modelo.entidad.Equipo;

/*
 * Clase de implementacion del servicio
 * 
 * Todos los metodos del servicio se ejecutan dentro de una transaccion
 */
@Service
@Transactional
public class EquipoServiceImpl implements EquipoService {

	// Dependencia al repositorio inyectada por el contenedor de Spring
	@Autowired
	private EquipoRepository repository;

	@Override
	public void agregarEquipo_Service(Equipo equipo) {
		repository.save(equipo);
		
	}

	@Override
	public void modificarEquipo_Service(Equipo equipo) {
		repository.save(equipo);
		
	}

	@Override
	public void eliminarEquipo_Service(Equipo equipo) {
		repository.delete(equipo);
		
	}

	@Override
	public Equipo obtener_un_equipo_Service(int id) {
		return repository.findOne(id);
	}

	@Override
	public List<Equipo> obtener_todos_los_equipos_Service() {
		return repository.findAll();
	}

}
