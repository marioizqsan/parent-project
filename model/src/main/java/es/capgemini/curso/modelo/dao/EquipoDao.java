package es.capgemini.curso.modelo.dao;

import java.util.List;

import es.capgemini.curso.modelo.entidad.Equipo;

public interface EquipoDao {
	
	// Metodo para añadir un nuevo equipo
	void agregarEquipo(Equipo equipo);
	
	// Metodo para eliminar un equipo por su nombre
	void eliminarEquipo(String nombreEquipo);
	
	// Metodo para obtener la informacion de un equipo por su nombre
	Equipo obtener_un_equipo(String nombre);
	
	// Metodo para devolver una lista con todos los equipos del sistema
	List<Equipo> obtener_todos_los_equipos();
	

}
