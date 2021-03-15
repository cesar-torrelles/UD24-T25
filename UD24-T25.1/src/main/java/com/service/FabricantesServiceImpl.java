package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.FabricantesDAO;
import com.dto.Fabricantes;

@Service
public class FabricantesServiceImpl implements FabricantesService{
	
	//Utilizamos los metodos de la interface IFabricantesDAO, es como si instaciaramos.
	@Autowired
	FabricantesDAO FabricantesDAO;
	
	@Override
	public List<Fabricantes> listarFabricantes() {
		
		return FabricantesDAO.findAll();
	}

	@Override
	public Fabricantes guardarFabricantes(Fabricantes Fabricantes) {
		
		return FabricantesDAO.save(Fabricantes);
	}

	@Override
	public Fabricantes FabricantesXID(Long id) {
		
		return FabricantesDAO.findById(id).get();
	}

	@Override
	public Fabricantes actualizarFabricantes(Fabricantes Fabricantes) {
		
		return FabricantesDAO.save(Fabricantes);
	}

	@Override
	public void eliminarFabricantes(Long id) {
		
		FabricantesDAO.deleteById(id);
		
	}

}