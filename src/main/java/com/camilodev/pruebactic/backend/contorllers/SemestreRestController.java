package com.camilodev.pruebactic.backend.contorllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.camilodev.pruebactic.backend.entities.Semestre;
import com.camilodev.pruebactic.backend.services.ISemestreService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("api")
public class SemestreRestController {
	
	@Autowired
	public ISemestreService semestreService;
	
	@GetMapping("/semestre")
	public List<Semestre> findAll(){
		return semestreService.findAll();
	}
	
	@GetMapping("/semestre/{num_semestre}")
	public List<Semestre> findSemestre(@PathVariable int num_semestre){
		return semestreService.findSemestre(num_semestre);
	}

}
