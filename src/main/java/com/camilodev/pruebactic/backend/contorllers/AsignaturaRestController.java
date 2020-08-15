package com.camilodev.pruebactic.backend.contorllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.camilodev.pruebactic.backend.entities.Asignatura;
import com.camilodev.pruebactic.backend.services.IAsignaturaService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("api")
public class AsignaturaRestController {
	
	@Autowired
	public IAsignaturaService asignaturaService;
	
	@GetMapping("/asignatura")
	public List<Asignatura> findAll(){
		return asignaturaService.findAll();
	}
	
	@GetMapping("/asignatura/{num_semestre}")
	public List<Asignatura> findBySemestre(@PathVariable int num_semestre){
		return asignaturaService.findBySemestre(num_semestre);
	}

}
