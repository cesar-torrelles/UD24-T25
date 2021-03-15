package com.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.dto.Empleados;
import com.service.EmpleadosServiceImpl;

@RestController
@RequestMapping("/api")
public class EmpleadosController {

	@Autowired
	EmpleadosServiceImpl EmpleadosServiceImpl;
	
	@GetMapping("/Empleados")
	public List<Empleados> listarEmpleados(){
		return EmpleadosServiceImpl.listarEmpleados();
	}
	
	@PostMapping("/Empleados")
	public Empleados salvarEmpleados(@RequestBody Empleados Empleados) {
		
		return EmpleadosServiceImpl.guardarEmpleados(Empleados);
	}
	
	@GetMapping("/Empleados/{id}")
	public Empleados EmpleadosXID(@PathVariable(name="id") Long id) {
		
		Empleados Empleados_xid= new Empleados();
		
		Empleados_xid=EmpleadosServiceImpl.EmpleadosXID(id);
		
		//System.out.println("Empleados XID: "+Empleados_xid);
		
		return Empleados_xid;
	}
	
	@PutMapping("/Empleados/{id}")
	public Empleados actualizarEmpleados(@PathVariable(name="id")Long id,@RequestBody Empleados Empleados) {
		
		Empleados Empleados_seleccionado= new Empleados();
		Empleados Empleados_actualizado= new Empleados();
		
		Empleados_seleccionado= EmpleadosServiceImpl.EmpleadosXID(id);
		
		Empleados_seleccionado.setId(Empleados.getId());
		Empleados_seleccionado.setnombre(Empleados.getnombre());
		Empleados_seleccionado.setapellidos(Empleados.getapellidos());
		Empleados_seleccionado.setDepartamentos(Empleados.getDepartamentos());
		
		Empleados_actualizado = EmpleadosServiceImpl.actualizarEmpleados(Empleados_seleccionado);
		
		//System.out.println("El Empleados actualizado es: "+ Empleados_actualizado);
		
		return Empleados_actualizado;
		
	
		
		
	}
	
	@DeleteMapping("/Empleados/{id}")
	public void eliminarEmpleados(@PathVariable(name="id")Long id) {
		EmpleadosServiceImpl.eliminarEmpleados(id);
	}
	
}