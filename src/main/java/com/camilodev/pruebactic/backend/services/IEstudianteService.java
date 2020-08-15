package com.camilodev.pruebactic.backend.services;

import com.camilodev.pruebactic.backend.entities.Estudiante;

public interface IEstudianteService {
	
	//GET ESTUDIANTE POR CODIGO
	public Estudiante findEstudinteByCode(String codigo);

}
