package com.crud.h2.service;

import java.util.List;

/**
 * @author Jose
 *
 */
import com.crud.h2.dto.Peliculas;

public interface IPeliculasService {

	//Metodos del CRUD
	public List<Peliculas> listarPeliculas(); //Listar All 
	
	public Peliculas guardarPeliculas(Peliculas cliente);	//Guarda un cliente CREATE
	
	public Peliculas peliculasXID(Long id); //Leer datos de un cliente READ
	
	public Peliculas actualizarPeliculas(Peliculas cliente); //Actualiza datos del cliente UPDATE
	
	public void eliminarAlmacenes(Long id);// Elimina el cliente DELETE
	
	
}
