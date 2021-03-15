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
@Table(name="Almacenes")//en caso que la tabla sea diferente
public class Almacenes  {
 
	//Atributos de entidad cliente
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private Long id;
	@Column(name = "lugar")//no hace falta si se llama igual
	private String lugar;
	@Column(name = "capacidad")//no hace falta si se llama igual
	private Integer capacidad;
	
    @OneToMany
    @JoinColumn(name="id")
    private List<Cajas> cajas;
	
	//Constructores
	
	public Almacenes() {
	
	}



	
	/**
	 * @param id
	 * @param lugar
	 * @param capacidad
	 * @param cajas
	 */
	public Almacenes(Long id, String lugar, Integer capacidad, List<Cajas> cajas) {
		super();
		this.id = id;
		this.lugar = lugar;
		this.capacidad = capacidad;
		this.cajas = cajas;
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
	 * @return the lugar
	 */
	public String getLugar() {
		return lugar;
	}

	/**
	 * @param lugar the lugar to set
	 */
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	/**
	 * @return the capacidad
	 */
	public Integer getCapacidad() {
		return capacidad;
	}

	/**
	 * @param capacidad the capacidad to set
	 */
	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}

	/**
	 * @return the video
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Cajas")
	public List<Cajas> getVideo() {
		return cajas;
	}

	/**
	 * @param video the video to set
	 */
	public void setVideo(List<Cajas> video) {
		this.cajas = video;
	}

	@Override
	public String toString() {
		return "Almacenes [id=" + id + ", lugar=" + lugar + ", capacidad=" + capacidad + ", cajas=" + cajas + "]";
	}


}
