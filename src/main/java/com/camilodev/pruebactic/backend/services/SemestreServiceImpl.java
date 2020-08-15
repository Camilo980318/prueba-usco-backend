package com.camilodev.pruebactic.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.camilodev.pruebactic.backend.dao.ISemestreDao;
import com.camilodev.pruebactic.backend.entities.Semestre;

@Service
public class SemestreServiceImpl implements ISemestreService {

	@Autowired
	public ISemestreDao semestreDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Semestre> findAll() {
		return (List<Semestre>) semestreDao.findAll();
	}

	@Override
	public List<Semestre> findSemestre(int num_semestre) {
		return semestreDao.findSemestre(num_semestre);
	}


}
