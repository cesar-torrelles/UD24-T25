package com.service;

import java.util.List;

/**
 * 
 *
 */
import com.dto.Departamentos;

public interface DepartamentosService {

	//Metodos del CRUD
	public List<Departamentos> listarDepartamentos(); //Listar All 
	
	public Departamentos guardarDepartamentos(Departamentos Departamentos);	//Guarda un Departamentos CREATE
	
	public Departamentos DepartamentosXID(Long id); //Leer datos de un Departamentos READ
	
	public Departamentos actualizarDepartamentos(Departamentos Departamentos); //Actualiza datos del Departamentos UPDATE
	
	public void eliminarDepartamentos(Long id);// Elimina el Departamentos DELETE
	
	
}