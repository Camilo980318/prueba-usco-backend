package com.camilodev.pruebactic.backend.services;

import java.util.List;

import com.camilodev.pruebactic.backend.entities.Asignatura;

public interface IAsignaturaService {
	
	List<Asignatura> findAll();
	List<Asignatura> findBySemestre(int num_semestre);

}
