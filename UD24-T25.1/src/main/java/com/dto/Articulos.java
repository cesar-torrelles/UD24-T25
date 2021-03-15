package com.dto;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="Articulos")//en caso que la tabla sea diferente

public class Articulos {
	
	//Atributos de entidad Fabricantes
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
		private Long id;
		
		@Column(name = "nombre")//no hace falta si se llama igual
		private String nombre;
		
		@Column(name = "precio")//no hace falta si se llama igual
		private int precio;
	
		
		
		@ManyToOne
	    @JoinColumn(name="Fabricantes")
	    private Fabricantes Fabricantes;

		//Constructores
		/**
		 * 
		 */
		public Articulos() {
			
		}

	
		/**
		 * @param id
		 * @param nombre
		 * @param precio
		 * @param Fabricantes
		 */
		public Articulos(Long id, String nombre, int precio, Fabricantes Fabricantes) {
			//super();
			this.id = id;
			this.nombre = nombre;
			this.precio = precio;
			this.Fabricantes = Fabricantes;
		}


		// getter y setter
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
		public String getnombre() {
			return nombre;
		}


		/**
		 * @param nombre the nombre to set
		 */
		public void setnombre(String nombre) {
			this.nombre = nombre;
		}


		/**
		 * @return the precio
		 */
		public int getprecio() {
			return precio;
		}


		/**
		 * @param precio the precio to set
		 */
		public void setprecio(int precio) {
			this.precio = precio;
		}


		/**
		 * @return the Fabricantes
		 */
		public Fabricantes getFabricantes() {
			return Fabricantes;
		}


		/**
		 * @param Fabricantes the Fabricantes to set
		 */
		public void setFabricantes(Fabricantes Fabricantes) {
			this.Fabricantes = Fabricantes;
		}


		//metodo toString
		@Override
		public String toString() {
			return "Articulos [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", Fabricantes=" + Fabricantes + "]";
		}
		
		
		
		
		
		
		
	

}