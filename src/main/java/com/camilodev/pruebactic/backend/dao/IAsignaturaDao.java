package com.camilodev.pruebactic.backend.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.camilodev.pruebactic.backend.entities.Asignatura;

public interface IAsignaturaDao extends CrudRepository<Asignatura, Long> {
	
	@Query(value = "SELECT * FROM asignatura WHERE asignatura.num_semestre = :num_semestre", nativeQuery = true)
	List<Asignatura> findBySemestre(@Param("num_semestre") int num_semestre);

}
