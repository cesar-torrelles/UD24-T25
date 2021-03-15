package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Cajas;

public interface ICajasService {

	//Metodos del CRUD
		public List<Cajas> listarCajas(); //Listar All 
		
		public Cajas guardarCajas(Cajas video);	//Guarda un video CREATE
		
		public Cajas cajasXID(Long id); //Leer datos de un video READ
		
		public Cajas actualizarCajas(Cajas video); //Actualiza datos del video UPDATE
		
		public void eliminarCajas(Long id);// Elimina el video DELETE
}
