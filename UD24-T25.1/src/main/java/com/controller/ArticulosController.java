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


import com.dto.Articulos;
import com.service.ArticulosServiceImpl;

@RestController
@RequestMapping("/api")
public class ArticulosController {

	@Autowired
	ArticulosServiceImpl ArticulosServiceImpl;
	
	@GetMapping("/Articulos")
	public List<Articulos> listarArticulos(){
		return ArticulosServiceImpl.listarArticulos();
	}
	
	@PostMapping("/Articulos")
	public Articulos salvarArticulos(@RequestBody Articulos Articulos) {
		
		return ArticulosServiceImpl.guardarArticulos(Articulos);
	}
	
	@GetMapping("/Articulos/{id}")
	public Articulos ArticulosXID(@PathVariable(name="id") Long id) {
		
		Articulos Articulos_xid= new Articulos();
		
		Articulos_xid=ArticulosServiceImpl.ArticulosXID(id);
		
		//System.out.println("Articulos XID: "+Articulos_xid);
		
		return Articulos_xid;
	}
	
	@PutMapping("/Articulos/{id}")
	public Articulos actualizarArticulos(@PathVariable(name="id")Long id,@RequestBody Articulos Articulos) {
		
		Articulos Articulos_seleccionado= new Articulos();
		Articulos Articulos_actualizado= new Articulos();
		
		Articulos_seleccionado= ArticulosServiceImpl.ArticulosXID(id);
		
		Articulos_seleccionado.setId(Articulos.getId());
		Articulos_seleccionado.setnombre(Articulos.getnombre());
		Articulos_seleccionado.setprecio(Articulos.getprecio());
		Articulos_seleccionado.setFabricantes(Articulos.getFabricantes());
		
		Articulos_actualizado = ArticulosServiceImpl.actualizarArticulos(Articulos_seleccionado);
		
		//System.out.println("El Articulos actualizado es: "+ Articulos_actualizado);
		
		return Articulos_actualizado;
		
	
		
		
	}
	
	@DeleteMapping("/Articulos/{id}")
	public void eliminarArticulos(@PathVariable(name="id")Long id) {
		ArticulosServiceImpl.eliminarArticulos(id);
	}
	
}