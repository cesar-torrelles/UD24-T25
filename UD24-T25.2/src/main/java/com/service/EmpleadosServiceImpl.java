package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.EmpleadosDAO;
import com.dto.Empleados;

@Service
public class EmpleadosServiceImpl implements EmpleadosService{

	@Autowired
	EmpleadosDAO EmpleadosDAO;
	
	@Override
	public List<Empleados> listarEmpleados() {
		
		return EmpleadosDAO.findAll();
	}
	
	@Override
	public Empleados guardarEmpleados(Empleados Empleados) {
		
		return EmpleadosDAO.save(Empleados);
	}

	@Override
	public Empleados EmpleadosXID(Long id) {
		
		return EmpleadosDAO.findById(id).get();
	}

	@Override
	public Empleados actualizarEmpleados(Empleados Empleados) {
		
		return EmpleadosDAO.save(Empleados);
	}

	@Override
	public void eliminarEmpleados(Long id) {
		
		EmpleadosDAO.deleteById(id);
		
	}
}