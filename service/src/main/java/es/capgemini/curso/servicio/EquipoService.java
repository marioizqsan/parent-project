package es.capgemini.curso.servicio;

import java.util.List;
import java.util.Optional;

import es.capgemini.curso.modelo.entidad.Equipo;

public interface EquipoService {

	// Metodo para añadir un nuevo equipo
	void agregarEquipo_Service(Equipo equipo);
	
	// Metodo para modificar un equipo
	void modificarEquipo_Service(Equipo equipo);

	// Metodo para eliminar un equipo por su nombre
	void eliminarEquipo_Service(Equipo equipo);

	// Metodo para obtener la informacion de un equipo por su id
	Optional<Equipo> obtener_un_equipo_Service(int id);

	// Metodo para devolver una lista con todos los equipos del sistema
	List<Equipo> obtener_todos_los_equipos_Service();
}
