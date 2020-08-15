package com.camilodev.pruebactic.backend.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.camilodev.pruebactic.backend.entities.Response;

public interface IResponseDao extends CrudRepository<Response, String> {
	
	
	/* NOTA: Este es el query que me permitía obtener la información que necesitaba de las 3 tablas,
	 * por alguna razón, cuando lo ejecutaba en el gestor de la base de datos, si me los traía, pero 
	 * cuando se ejecutaba por aquí, no funcionó, traía datos repetidos */
	
	String queryBySemestre = "SELECT estudiante.codigo_estudiante, asignatura.nombre_asignatura, asignatura.codigo_asignatura, asignatura.creditos, asignatura.nota, semestre.num_semestre, semestre.ponderado\n" + 
			"FROM semestre\n" + 
			"INNER JOIN estudiante ON semestre.estudiante = estudiante.id_estudiante\n" + 
			"INNER JOIN asignatura ON semestre.asignatura = asignatura.id_asignatura\n"+
			"WHERE semestre.num_semestre = :num_semestre";
	
	
	@Query(value = queryBySemestre, nativeQuery = true)
	List<Response> getResponseBySemestre(@Param("num_semestre") int num_semestre);
}
