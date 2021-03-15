package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IPeliculasDAO;
import com.crud.h2.dto.Peliculas;

@Service
public class PeliculasServiceImpl implements IPeliculasService{
	
	//Utilizamos los metodos de la interface IClienteDAO, es como si instaciaramos.
	@Autowired
	IPeliculasDAO iClienteDAO;
	
	@Override
	public List<Peliculas> listarPeliculas() {
		
		return iClienteDAO.findAll();
	}

	@Override
	public Peliculas guardarPeliculas(Peliculas cliente) {
		
		return iClienteDAO.save(cliente);
	}

	@Override
	public Peliculas peliculasXID(Long id) {
		
		return iClienteDAO.findById(id).get();
	}

	@Override
	public Peliculas actualizarPeliculas(Peliculas cliente) {
		
		return iClienteDAO.save(cliente);
	}

	@Override
	public void eliminarAlmacenes(Long id) {
		
		iClienteDAO.deleteById(id);
		
	}

}
