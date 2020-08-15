package com.camilodev.pruebactic.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.camilodev.pruebactic.backend.dao.IAsignaturaDao;
import com.camilodev.pruebactic.backend.entities.Asignatura;

@Service
public class AsignaturaServiceImpl implements IAsignaturaService {

	@Autowired
	public IAsignaturaDao asignaturaDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Asignatura> findAll() {
		return (List<Asignatura>) asignaturaDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public List<Asignatura> findBySemestre(int num_semestre) {
		return asignaturaDao.findBySemestre(num_semestre);
	}

}
