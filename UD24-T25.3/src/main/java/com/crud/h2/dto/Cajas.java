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
@Table(name="Cajas")//en caso que la tabla sea diferente

public class Cajas {
	
	//Atributos de entidad cliente
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
		private Long id;
		@Column(name = "contenido")//no hace falta si se llama igual
		private String contenido;
		@Column(name = "valor")//no hace falta si se llama igual
		private Integer valor;
		
		@ManyToOne
	    @JoinColumn(name="almacen")
	    private Almacenes cliente;

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
		 * @return the contenido
		 */
		public String getContenido() {
			return contenido;
		}

		/**
		 * @param contenido the contenido to set
		 */
		public void setContenido(String contenido) {
			this.contenido = contenido;
		}

		/**
		 * @return the valor
		 */
		public Integer getValor() {
			return valor;
		}

		/**
		 * @param valor the valor to set
		 */
		public void setValor(Integer valor) {
			this.valor = valor;
		}

		/**
		 * @return the cliente
		 */
		public Almacenes getCliente() {
			return cliente;
		}

		/**
		 * @param cliente the cliente to set
		 */
		public void setCliente(Almacenes cliente) {
			this.cliente = cliente;
		}

		/**
		 * @param id
		 * @param contenido
		 * @param valor
		 * @param cliente
		 */
		public Cajas(Long id, String contenido, Integer valor, Almacenes cliente) {
			this.id = id;
			this.contenido = contenido;
			this.valor = valor;
			this.cliente = cliente;
		}

		/**
		 * 
		 */
		public Cajas() {
		}

		@Override
		public String toString() {
			return "Cajas [id=" + id + ", contenido=" + contenido + ", valor=" + valor + ", cliente=" + cliente + "]";
		}

				
		
		
		
		
		
	

}
