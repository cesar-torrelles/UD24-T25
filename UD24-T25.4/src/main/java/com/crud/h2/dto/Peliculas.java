package com.crud.h2.dto;

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
@Table(name="Peliculas")//en caso que la tabla sea diferente
public class Peliculas  {
 
	//Atributos de entidad cliente
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private Long id;
	@Column(name = "nombre")//no hace falta si se llama igual
	private String nombre;
	@Column(name = "calificacionEdad")//no hace falta si se llama igual
	private Integer calificacionEdad;
	
    @OneToMany
    @JoinColumn(name="id")
    private List<Salas> salas;
	
	//Constructores
	
	public Peliculas() {
	
	}

	/**
	 * @param id
	 * @param nombre
	 * @param calificacionEdad
	 * @param cajas
	 */
	public Peliculas(Long id, String nombre, Integer calificacionEdad, List<Salas> cajas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.calificacionEdad = calificacionEdad;
		this.salas = cajas;
	}


	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the calificacionEdad
	 */
	public Integer getCalificacionEdad() {
		return calificacionEdad;
	}


	/**
	 * @param calificacionEdad the calificacionEdad to set
	 */
	public void setCalificacionEdad(Integer calificacionEdad) {
		this.calificacionEdad = calificacionEdad;
	}


	/**
	 * @return the video
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Salas")
	public List<Salas> getPeliculas() {
		return salas;
	}

	/**
	 * @param video the video to set
	 */
	public void setVideo(List<Salas> salas) {
		this.salas = salas;
	}

	@Override
	public String toString() {
		return "Almacenes [id=" + id + ", lugar=" + nombre + ", capacidad=" + calificacionEdad + ", cajas=" + salas + "]";
	}


}
