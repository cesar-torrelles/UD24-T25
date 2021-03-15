package com.crud.h2.service;

import java.util.List;

/**
 * @author Jose
 *
 */
import com.crud.h2.dto.Almacenes;

public interface IAlmacenesService {

	//Metodos del CRUD
	public List<Almacenes> listarPeliculas(); //Listar All 
	
	public Almacenes guardarAlmacenes(Almacenes cliente);	//Guarda un cliente CREATE
	
	public Almacenes peliculasXID(Long id); //Leer datos de un cliente READ
	
	public Almacenes actualizarAlmacenes(Almacenes cliente); //Actualiza datos del cliente UPDATE
	
	public void eliminarPeliculas(Long id);// Elimina el cliente DELETE
	
	
}
