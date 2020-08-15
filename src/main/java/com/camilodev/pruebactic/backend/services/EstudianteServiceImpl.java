package com.camilodev.pruebactic.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.camilodev.pruebactic.backend.dao.IEstudianteDao;
import com.camilodev.pruebactic.backend.entities.Estudiante;

@Service
public class EstudianteServiceImpl implements IEstudianteService {

	@Autowired
	private IEstudianteDao  estudianteDao;
	
	@Override
	@Transactional(readOnly = true)
	public Estudiante findEstudinteByCode(String codigo) {
		return estudianteDao.findEstudinteByCode(codigo);
	}

}
