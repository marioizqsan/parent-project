package es.capgemini.curso.modelo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import es.capgemini.curso.modelo.entidad.Equipo;

@Repository
public class EquipoDaoImpl implements EquipoDao {

	@Override
	public void agregarEquipo(Equipo equipo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminarEquipo(String nombreEquipo) {
		// TODO Auto-generated method stub

	}

	@Override
	public Equipo obtener_un_equipo(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Equipo> obtener_todos_los_equipos() {
		// TODO Auto-generated method stub
		return null;
	}

}
