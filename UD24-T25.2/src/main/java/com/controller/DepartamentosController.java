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
import com.dto.Departamentos;
import com.service.DepartamentosServiceImpl;

@RestController
@RequestMapping("/api")
public class DepartamentosController {
	
	@Autowired
	DepartamentosServiceImpl DepartamentosServiceImpl;
	
	@GetMapping("/Departamentos")
	public List<Departamentos> listarDepartamentos(){
		return DepartamentosServiceImpl.listarDepartamentos();
	}
	
	@PostMapping("/Departamentos")
	public Departamentos salvarDepartamentos(@RequestBody Departamentos Departamentos) {
		
		return DepartamentosServiceImpl.guardarDepartamentos(Departamentos);
	}
	
	@GetMapping("/Departamentos/{id}")
	public Departamentos DepartamentosXID(@PathVariable(name="id") Long id) {
		
		Departamentos Departamentos_xid= new Departamentos();
		
		Departamentos_xid=DepartamentosServiceImpl.DepartamentosXID(id);
		
		//System.out.println("Departamentos XID: "+Departamentos_xid);
		
		return Departamentos_xid;
	}
	
	@PutMapping("/Departamentos/{id}")
	public Departamentos actualizarDepartamentos(@PathVariable(name="id")Long id,@RequestBody Departamentos Departamentos) {
		
		Departamentos Departamentos_seleccionado= new Departamentos();
		Departamentos Departamentos_actualizado= new Departamentos();
		
		Departamentos_seleccionado= DepartamentosServiceImpl.DepartamentosXID(id);
		
		Departamentos_seleccionado.setNombre(Departamentos.getNombre());
		Departamentos_seleccionado.setPresupuesto(Departamentos.getPresupuesto());
		
		
	
		
		Departamentos_actualizado = DepartamentosServiceImpl.actualizarDepartamentos(Departamentos_seleccionado);
		
		//System.out.println("El Departamentos actualizado es: "+ Departamentos_actualizado);
		
		return Departamentos_actualizado;
	}
	
	@DeleteMapping("/Departamentos/{id}")
	public void eleiminarDepartamentos(@PathVariable(name="id")Long id) {
		DepartamentosServiceImpl.eliminarDepartamentos(id);
	}
	
	
}