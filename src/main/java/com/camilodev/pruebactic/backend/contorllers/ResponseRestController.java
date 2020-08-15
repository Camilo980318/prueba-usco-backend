package com.camilodev.pruebactic.backend.contorllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.camilodev.pruebactic.backend.entities.Response;
import com.camilodev.pruebactic.backend.services.IResponeService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("api")
public class ResponseRestController {
	
	@Autowired
	public IResponeService responseService;
	
	
	@GetMapping("/response/{num_semestre}")
	public List<Response> getResponseBySemestre(@PathVariable int num_semestre){
		
		/*Esta es la forma de obtener el puntaje ponderado, lastimosamente, no se pudo utilizar 
		 * debido a la ejecución del query, *ver nota en IResponseDao* */
		
		float notasCreditos = 0;
		int total_creditos = 0;
		
		List<Response> data = responseService.getResponseBySemestre(num_semestre);
		
		for(int i=0; i < data.size(); i++) {
			notasCreditos += (data.get(i).getNota() * data.get(i).getCreditos());
			total_creditos += data.get(i).getCreditos();
		}
		
		float ponderado = notasCreditos / total_creditos;
		
		for(int i=0; i < data.size(); i++) {
			data.get(i).setPonderado(ponderado);
			System.out.println(data);
		}
		
		return responseService.getResponseBySemestre(num_semestre);
	}

}
