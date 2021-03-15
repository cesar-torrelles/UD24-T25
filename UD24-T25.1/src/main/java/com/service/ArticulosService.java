package com.service;

import java.util.List;

import com.dto.Articulos;

public interface ArticulosService {

	//Metodos del CRUD
		public List<Articulos> listarArticulos(); //Listar All 
		
		public Articulos guardarArticulos(Articulos Articulos);	//Guarda un Articulos CREATE
		
		public Articulos ArticulosXID(Long id); //Leer datos de un Articulos READ
		
		public Articulos actualizarArticulos(Articulos Articulos); //Actualiza datos del Articulos UPDATE
		
		public void eliminarArticulos(Long id);// Elimina el Articulos DELETE
}