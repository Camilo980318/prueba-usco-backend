package com.camilodev.pruebactic.backend.contorllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.camilodev.pruebactic.backend.entities.Estudiante;
import com.camilodev.pruebactic.backend.services.IEstudianteService;

@CrossOrigin(origins = {"http://localhost:4200"})
@Controller
@RequestMapping("api")
public class EstudianteRestController {
	
	@Autowired
	public IEstudianteService estudianteService;
	
	
	@GetMapping("/estudiante/{codigo_estudiante}")
	public ResponseEntity<?> getEsutdianteByCode(@PathVariable String codigo_estudiante){
		
		Estudiante estudiante = null;
		Map<String, Object> response = new HashMap<>();
		
		try {
			estudiante = estudianteService.findEstudinteByCode(codigo_estudiante);
		} catch (DataAccessException e) {
			
			response.put("ok", false);
			response.put("mensaje", "Error al encontrar el estudiante");
			response.put("error", "Error: ".concat(e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage())));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		if(estudiante == null) {
			response.put("ok", false);
			response.put("mensaje", "El estudiante no existe");
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
		}
		
		response.put("ok", true);
		response.put("estudiante", estudiante);
		
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
	}

}
