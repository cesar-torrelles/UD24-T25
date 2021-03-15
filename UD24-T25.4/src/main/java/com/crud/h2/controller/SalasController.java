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

import com.crud.h2.dto.Salas;
import com.crud.h2.service.SalasServiceImpl;

@RestController
@RequestMapping("/api")
public class SalasController {

	@Autowired
	SalasServiceImpl videoServideImpl;
	
	@GetMapping("/salas")
	public List<Salas> listarVideos(){
		return videoServideImpl.listarSalas();
	}
	
	@PostMapping("/salas")
	public Salas salvarVideo(@RequestBody Salas salas) {
		
		return videoServideImpl.guardarSalas(salas);
	}
	
	@GetMapping("/salas/{id}")
	public Salas videoXID(@PathVariable(name="id") Long id) {
		
		Salas salas_xid= new Salas();
		
		salas_xid=videoServideImpl.salasXID(id);
		
		return salas_xid;
	}
	
	@PutMapping("/salas/{id}")
	public Salas actualizarVideo(@PathVariable(name="id")Long id,@RequestBody Salas sala) {
		
		Salas salas_seleccionado= new Salas();
		Salas salas_actualizado= new Salas();
		
		salas_seleccionado= videoServideImpl.salasXID(id);
		
		salas_seleccionado.setNombre(sala.getNombre());
		
		salas_actualizado = videoServideImpl.actualizarSalas(salas_seleccionado);

		return salas_actualizado;
	}
	
	@DeleteMapping("/salas/{id}")
	public void eliminarVideo(@PathVariable(name="id")Long id) {
		videoServideImpl.eliminarSalas(id);
	}
	
}
