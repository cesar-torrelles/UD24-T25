package com.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Fabricantes")//en caso que la tabla sea diferente
public class Fabricantes  {
 
	//Atributos de entidad Fabricantes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private Long id;
	
	@Column(name = "nombre")//no hace falta si se llama igual
	private String nombre;
	

	
    @OneToMany
    @JoinColumn(name="id")
    private List<Articulos> Articulos;
	
	//Constructores
	
	public Fabricantes() {
	
	}

	/**
	 * @param id
	 * @param nombre
	 * @param apellido
	 * @param direccion
	 * @param dni
	 * @param fecha
	 */
	public Fabricantes(Long id, String nombre ) {
		
		//super();
		this.id = id;
		this.nombre = nombre;
	}

	
	//Getters y Setters
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Articulos")
	public List<Articulos> getArticulos() {
		return Articulos;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	

	/**
	 * @param Articulos the Articulos to set
	 */
	public void setArticulos(List<Articulos> Articulos) {
		this.Articulos = Articulos;
	}

	
	
	
	
	
}