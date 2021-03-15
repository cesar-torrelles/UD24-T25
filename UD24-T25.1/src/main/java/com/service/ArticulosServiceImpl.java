package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ArticulosDAO;
import com.dto.Articulos;

@Service
public class ArticulosServiceImpl implements ArticulosService{

	@Autowired
	ArticulosDAO ArticulosDAO;
	
	@Override
	public List<Articulos> listarArticulos() {
		
		return ArticulosDAO.findAll();
	}
	
	@Override
	public Articulos guardarArticulos(Articulos Articulos) {
		
		return ArticulosDAO.save(Articulos);
	}

	@Override
	public Articulos ArticulosXID(Long id) {
		
		return ArticulosDAO.findById(id).get();
	}

	@Override
	public Articulos actualizarArticulos(Articulos Articulos) {
		
		return ArticulosDAO.save(Articulos);
	}

	@Override
	public void eliminarArticulos(Long id) {
		
		ArticulosDAO.deleteById(id);
		
	}
}