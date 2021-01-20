package es.capgemini.curso.modelo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import es.capgemini.curso.modelo.entidad.Equipo;

/*
 * Capa de acceso a datos (DAO)
 */
@Repository
public class EquipoDaoImpl implements EquipoDao {

	// Almacén de datos
	private List<Equipo> equipos = new ArrayList<Equipo>();

	@Override
	public void agregarEquipo(Equipo equipo) {
		equipos.add(equipo);

	}

	@Override
	public void eliminarEquipo(String nombreEquipo) {
		for (Equipo e : equipos) {
			if (e.getNombre() == nombreEquipo) {
				equipos.remove(e);
			}
		}

	}

	@Override
	public Equipo obtener_un_equipo(String nombre) {
		Equipo equipo = new Equipo();
		for (Equipo e : equipos) {
			if (e.getNombre() == nombre) {
				equipo = e;
			}
		}
		return equipo;
	}

	@Override
	public List<Equipo> obtener_todos_los_equipos() {
		return equipos;
	}

}
