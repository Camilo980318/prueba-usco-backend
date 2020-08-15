package com.camilodev.pruebactic.backend.services;

import java.util.List;

import com.camilodev.pruebactic.backend.entities.Response;


public interface IResponeService {

	
	//List<Response> getResponse();
	List<Response> getResponseBySemestre(int num_semestre);
	
}
