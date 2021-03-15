package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.ISalasDAO;
import com.crud.h2.dto.Salas;

@Service
public class SalasServiceImpl implements ISalasService{

	@Autowired
	ISalasDAO ICajasDAO;
	
	@Override
	public List<Salas> listarSalas() {
		
		return ICajasDAO.findAll();
	}
	
	@Override
	public Salas guardarSalas(Salas video) {
		
		return ICajasDAO.save(video);
	}

	@Override
	public Salas salasXID(Long id) {
		
		return ICajasDAO.findById(id).get();
	}

	@Override
	public Salas actualizarSalas(Salas video) {
		
		return ICajasDAO.save(video);
	}

	@Override
	public void eliminarSalas(Long id) {
		
		ICajasDAO.deleteById(id);
		
	}
}
