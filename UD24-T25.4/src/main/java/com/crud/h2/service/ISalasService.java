package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Salas;

public interface ISalasService {

	//Metodos del CRUD
		public List<Salas> listarSalas(); //Listar All 
		
		public Salas guardarSalas(Salas video);	//Guarda un video CREATE
		
		public Salas salasXID(Long id); //Leer datos de un video READ
		
		public Salas actualizarSalas(Salas video); //Actualiza datos del video UPDATE
		
		public void eliminarSalas(Long id);// Elimina el video DELETE
}
