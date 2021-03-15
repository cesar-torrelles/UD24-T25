package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.ICajasDAO;
import com.crud.h2.dto.Cajas;

@Service
public class CajasServiceImpl implements ICajasService{

	@Autowired
	ICajasDAO ICajasDAO;
	
	@Override
	public List<Cajas> listarCajas() {
		
		return ICajasDAO.findAll();
	}
	
	@Override
	public Cajas guardarCajas(Cajas video) {
		
		return ICajasDAO.save(video);
	}

	@Override
	public Cajas cajasXID(Long id) {
		
		return ICajasDAO.findById(id).get();
	}

	@Override
	public Cajas actualizarCajas(Cajas video) {
		
		return ICajasDAO.save(video);
	}

	@Override
	public void eliminarCajas(Long id) {
		
		ICajasDAO.deleteById(id);
		
	}
}
