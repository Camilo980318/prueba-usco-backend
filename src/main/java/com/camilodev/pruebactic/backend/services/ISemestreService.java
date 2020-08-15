package com.camilodev.pruebactic.backend.services;

import java.util.List;

import com.camilodev.pruebactic.backend.entities.Semestre;

public interface ISemestreService {
	
	List<Semestre> findAll();
	
	List<Semestre> findSemestre(int num_semestre);
	
}
