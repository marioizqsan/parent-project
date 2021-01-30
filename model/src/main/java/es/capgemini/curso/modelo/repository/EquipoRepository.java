package es.capgemini.curso.modelo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.capgemini.curso.modelo.entidad.Equipo;

/*
 * Repositorio del modelo
 */

@Repository
public interface EquipoRepository extends JpaRepository<Equipo, Integer> {
	

}
