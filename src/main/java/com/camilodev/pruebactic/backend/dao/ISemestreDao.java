package com.camilodev.pruebactic.backend.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.camilodev.pruebactic.backend.entities.Semestre;

public interface ISemestreDao extends CrudRepository<Semestre, Long> {

	@Query(value = "SELECT * FROM semestre WHERE semestre.num_semestre = :num_semestre", nativeQuery = true)
	List<Semestre> findSemestre(@Param("num_semestre") int num_semestre);
}
