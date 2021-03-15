package com.service;

import java.util.List;

/**
 * 
 *
 */
import com.dto.Fabricantes;

public interface FabricantesService {

	//Metodos del CRUD
	public List<Fabricantes> listarFabricantes(); //Listar All 
	
	public Fabricantes guardarFabricantes(Fabricantes Fabricantes);	//Guarda un Fabricantes CREATE
	
	public Fabricantes FabricantesXID(Long id); //Leer datos de un Fabricantes READ
	
	public Fabricantes actualizarFabricantes(Fabricantes Fabricantes); //Actualiza datos del Fabricantes UPDATE
	
	public void eliminarFabricantes(Long id);// Elimina el Fabricantes DELETE
	
	
}