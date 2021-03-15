package com.crud.h2.controller;

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
import com.crud.h2.dto.Peliculas;
import com.crud.h2.service.PeliculasServiceImpl;

@RestController
@RequestMapping("/api")
public class PeliculasController {
	
	@Autowired
	PeliculasServiceImpl peliculasServiceImpl;
	
	@GetMapping("/peliculas")
	public List<Peliculas> listarClientes(){
		return peliculasServiceImpl.listarPeliculas();
	}
	
	@PostMapping("/peliculas")
	public Peliculas salvarCliente(@RequestBody Peliculas cliente) {
		
		return peliculasServiceImpl.guardarPeliculas(cliente);
	}
	
	@GetMapping("/peliculas/{id}")
	public Peliculas clienteXID(@PathVariable(name="id") Long id) {
		
		Peliculas peliculas_xid= new Peliculas();
		
		peliculas_xid=peliculasServiceImpl.peliculasXID(id);
		
		return peliculas_xid;
	}
	
	@PutMapping("/peliculas/{id}")
	public Peliculas actualizarCliente(@PathVariable(name="id")Long id,@RequestBody Peliculas almacenes) {
		
		Peliculas peliculas_seleccionado= new Peliculas();
		Peliculas peliculas_actualizado= new Peliculas();
		
		peliculas_seleccionado= peliculasServiceImpl.peliculasXID(id);
		
		peliculas_seleccionado.setNombre(almacenes.getNombre());
		peliculas_seleccionado.setCalificacionEdad(almacenes.getCalificacionEdad());

		
		peliculas_actualizado = peliculasServiceImpl.actualizarPeliculas(peliculas_seleccionado);
		
		return peliculas_actualizado;
	}
	
	@DeleteMapping("/peliculas/{id}")
	public void eleiminarCliente(@PathVariable(name="id")Long id) {
		peliculasServiceImpl.eliminarAlmacenes(id);
	}
	
	
}
