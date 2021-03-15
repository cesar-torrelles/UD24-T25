package com.service;

import java.util.List;

import com.dto.Empleados;

public interface EmpleadosService {

	//Metodos del CRUD
		public List<Empleados> listarEmpleados(); //Listar All 
		
		public Empleados guardarEmpleados(Empleados Empleados);	//Guarda un Empleados CREATE
		
		public Empleados EmpleadosXID(Long id); //Leer datos de un Empleados READ
		
		public Empleados actualizarEmpleados(Empleados Empleados); //Actualiza datos del Empleados UPDATE
		
		public void eliminarEmpleados(Long id);// Elimina el Empleados DELETE
}