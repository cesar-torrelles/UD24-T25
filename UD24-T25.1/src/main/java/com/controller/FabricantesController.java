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
import com.dto.Fabricantes;
import com.service.FabricantesServiceImpl;

@RestController
@RequestMapping("/api")
public class FabricantesController {
	
	@Autowired
	FabricantesServiceImpl FabricantesServiceImpl;
	
	@GetMapping("/Fabricantes")
	public List<Fabricantes> listarFabricantes(){
		return FabricantesServiceImpl.listarFabricantes();
	}
	
	@PostMapping("/Fabricantes")
	public Fabricantes salvarFabricantes(@RequestBody Fabricantes Fabricantes) {
		
		return FabricantesServiceImpl.guardarFabricantes(Fabricantes);
	}
	
	@GetMapping("/Fabricantes/{id}")
	public Fabricantes FabricantesXID(@PathVariable(name="id") Long id) {
		
		Fabricantes Fabricantes_xid= new Fabricantes();
		
		Fabricantes_xid=FabricantesServiceImpl.FabricantesXID(id);
		
		//System.out.println("Fabricantes XID: "+Fabricantes_xid);
		
		return Fabricantes_xid;
	}
	
	@PutMapping("/Fabricantes/{id}")
	public Fabricantes actualizarFabricantes(@PathVariable(name="id")Long id,@RequestBody Fabricantes Fabricantes) {
		
		Fabricantes Fabricantes_seleccionado= new Fabricantes();
		Fabricantes Fabricantes_actualizado= new Fabricantes();
		
		Fabricantes_seleccionado= FabricantesServiceImpl.FabricantesXID(id);
		
		Fabricantes_seleccionado.setId(Fabricantes.getId());
		Fabricantes_seleccionado.setNombre(Fabricantes.getNombre());
		
		
		
	
		
		Fabricantes_actualizado = FabricantesServiceImpl.actualizarFabricantes(Fabricantes_seleccionado);
		
		//System.out.println("El Fabricantes actualizado es: "+ Fabricantes_actualizado);
		
		return Fabricantes_actualizado;
	}
	
	@DeleteMapping("/Fabricantes/{id}")
	public void eleiminarFabricantes(@PathVariable(name="id")Long id) {
		FabricantesServiceImpl.eliminarFabricantes(id);
	}
	
	
}