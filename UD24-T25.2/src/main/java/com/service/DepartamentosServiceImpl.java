package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.DepartamentosDAO;
import com.dto.Departamentos;

@Service
public class DepartamentosServiceImpl implements DepartamentosService{
	
	//Utilizamos los metodos de la interface IDepartamentosDAO, es como si instaciaramos.
	@Autowired
	DepartamentosDAO DepartamentosDAO;
	
	@Override
	public List<Departamentos> listarDepartamentos() {
		
		return DepartamentosDAO.findAll();
	}

	@Override
	public Departamentos guardarDepartamentos(Departamentos Departamentos) {
		
		return DepartamentosDAO.save(Departamentos);
	}

	@Override
	public Departamentos DepartamentosXID(Long id) {
		
		return DepartamentosDAO.findById(id).get();
	}

	@Override
	public Departamentos actualizarDepartamentos(Departamentos Departamentos) {
		
		return DepartamentosDAO.save(Departamentos);
	}

	@Override
	public void eliminarDepartamentos(Long id) {
		
		DepartamentosDAO.deleteById(id);
		
	}

}