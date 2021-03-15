package com.crud.h2.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="Salas")//en caso que la tabla sea diferente

public class Salas {
	
	//Atributos de entidad cliente
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
		private Long id;
		@Column(name = "nombre")//no hace falta si se llama igual
		private String nombre;
		
		@ManyToOne
	    @JoinColumn(name="pelicula")
	    private Peliculas pelicula;

		
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
		 * @return the pelicula
		 */
		public Peliculas getPelicula() {
			return pelicula;
		}

		/**
		 * @param pelicula the pelicula to set
		 */
		public void setPelicula(Peliculas pelicula) {
			this.pelicula = pelicula;
		}

		/**
		 * @param id
		 * @param contenido
		 * @param valor
		 * @param cliente
		 */
		public Salas(Long id, String contenido, Integer valor, Peliculas cliente) {
			this.id = id;
			this.nombre = contenido;
			this.pelicula = cliente;
		}
		/**
		 * 
		 */
		public Salas() {
		}

		@Override
		public String toString() {
			return "Cajas [id=" + id + ", contenido=" + nombre + ", cliente=" + pelicula + "]";
		}

				
		
		
		
		
		
	

}
