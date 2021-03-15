package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IAlmacenesDAO;
import com.crud.h2.dto.Almacenes;

@Service
public class AlmacenesServiceImpl implements IAlmacenesService{
	
	//Utilizamos los metodos de la interface IClienteDAO, es como si instaciaramos.
	@Autowired
	IAlmacenesDAO iClienteDAO;
	
	@Override
	public List<Almacenes> listarPeliculas() {
		
		return iClienteDAO.findAll();
	}

	@Override
	public Almacenes guardarAlmacenes(Almacenes cliente) {
		
		return iClienteDAO.save(cliente);
	}

	@Override
	public Almacenes peliculasXID(Long id) {
		
		return iClienteDAO.findById(id).get();
	}

	@Override
	public Almacenes actualizarAlmacenes(Almacenes cliente) {
		
		return iClienteDAO.save(cliente);
	}

	@Override
	public void eliminarPeliculas(Long id) {
		
		iClienteDAO.deleteById(id);
		
	}

}
