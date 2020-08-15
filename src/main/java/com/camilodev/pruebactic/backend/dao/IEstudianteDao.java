package com.camilodev.pruebactic.backend.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.camilodev.pruebactic.backend.entities.Estudiante;

public interface IEstudianteDao extends CrudRepository<Estudiante, Long> {
	
	@Query(value = "SELECT * FROM estudiante WHERE codigo_estudiante = :codigo_estudiante", nativeQuery = true)
	Estudiante findEstudinteByCode(@Param("codigo_estudiante") String codigo_estudiante);
	
}
