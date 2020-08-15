package com.camilodev.pruebactic.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.camilodev.pruebactic.backend.dao.IResponseDao;
import com.camilodev.pruebactic.backend.entities.Response;

@Service
public class ResponseServiceImpl implements IResponeService {
	
	@Autowired
	public IResponseDao responseDao;

	/*@Override
	@Transactional(readOnly = true)
	public List<Response> getResponse() {
		return (List<Response>) responseDao.getResponse();
	}*/

	@Override
	@Transactional(readOnly = true)
	public List<Response> getResponseBySemestre(int num_semestre) {
		return responseDao.getResponseBySemestre(num_semestre);
	}

}
