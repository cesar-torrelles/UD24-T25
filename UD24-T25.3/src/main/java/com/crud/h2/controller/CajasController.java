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

import com.crud.h2.dto.Cajas;
import com.crud.h2.service.CajasServiceImpl;

@RestController
@RequestMapping("/api")
public class CajasController {

	@Autowired
	CajasServiceImpl videoServideImpl;
	
	@GetMapping("/cajas")
	public List<Cajas> listarVideos(){
		return videoServideImpl.listarCajas();
	}
	
	@PostMapping("/cajas")
	public Cajas salvarVideo(@RequestBody Cajas video) {
		
		return videoServideImpl.guardarCajas(video);
	}
	
	@GetMapping("/cajas/{id}")
	public Cajas videoXID(@PathVariable(name="id") Long id) {
		
		Cajas video_xid= new Cajas();
		
		video_xid=videoServideImpl.cajasXID(id);
		
		return video_xid;
	}
	
	@PutMapping("/cajas/{id}")
	public Cajas actualizarVideo(@PathVariable(name="id")Long id,@RequestBody Cajas video) {
		
		Cajas video_seleccionado= new Cajas();
		Cajas video_actualizado= new Cajas();
		
		video_seleccionado= videoServideImpl.cajasXID(id);
		
		video_seleccionado.setCliente(video.getCliente());
		
		video_actualizado = videoServideImpl.actualizarCajas(video_seleccionado);
		
		return video_actualizado;
	}
	
	@DeleteMapping("/cajas/{id}")
	public void eliminarVideo(@PathVariable(name="id")Long id) {
		videoServideImpl.eliminarCajas(id);
	}
	
}
