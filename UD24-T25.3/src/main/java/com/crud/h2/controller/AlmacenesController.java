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
import com.crud.h2.dto.Almacenes;
import com.crud.h2.service.AlmacenesServiceImpl;

@RestController
@RequestMapping("/api")
public class AlmacenesController {
	
	@Autowired
	AlmacenesServiceImpl clienteServideImpl;
	
	@GetMapping("/almacenes")
	public List<Almacenes> listarClientes(){
		return clienteServideImpl.listarPeliculas();
	}
	
	@PostMapping("/almacenes")
	public Almacenes salvarCliente(@RequestBody Almacenes cliente) {
		
		return clienteServideImpl.guardarAlmacenes(cliente);
	}
	
	@GetMapping("/almacenes/{id}")
	public Almacenes clienteXID(@PathVariable(name="id") Long id) {
		
		Almacenes cliente_xid= new Almacenes();
		
		cliente_xid=clienteServideImpl.peliculasXID(id);
		
		return cliente_xid;
	}
	
	@PutMapping("/almacenes/{id}")
	public Almacenes actualizarCliente(@PathVariable(name="id")Long id,@RequestBody Almacenes almacenes) {
		
		Almacenes almacenes_seleccionado= new Almacenes();
		Almacenes almacenes_actualizado= new Almacenes();
		
		almacenes_seleccionado= clienteServideImpl.peliculasXID(id);
		
		almacenes_seleccionado.setLugar(almacenes.getLugar());
		almacenes_seleccionado.setCapacidad(almacenes.getCapacidad());

		
		almacenes_actualizado = clienteServideImpl.actualizarAlmacenes(almacenes_seleccionado);
		
		return almacenes_actualizado;
	}
	
	@DeleteMapping("/almacenes/{id}")
	public void eleiminarCliente(@PathVariable(name="id")Long id) {
		clienteServideImpl.eliminarPeliculas(id);
	}
	
	
}
