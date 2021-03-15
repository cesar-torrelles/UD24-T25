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
@Table(name="Empleados")//en caso que la tabla sea diferente

public class Empleados {
	
	//Atributos de entidad Departamentos
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
		private Long id;
		
		@Column(name = "nombre")//no hace falta si se llama igual
		private String nombre;
		
		@Column(name = "apellidos")//no hace falta si se llama igual
		private String apellidos;
	
		
		
		@ManyToOne
	    @JoinColumn(name="Departamentos")
	    private Departamentos Departamentos;

		//Constructores
		/**
		 * 
		 */
		public Empleados() {
			
		}

	
		/**
		 * @param id
		 * @param nombre
		 * @param apellidos
		 * @param Departamentos
		 */
		public Empleados(Long id, String nombre, String apellidos, Departamentos Departamentos) {
			//super();
			this.id = id;
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.Departamentos = Departamentos;
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
		 * @return the apellidos
		 */
		public String getapellidos() {
			return apellidos;
		}


		/**
		 * @param apellidos the apellidos to set
		 */
		public void setapellidos(String apellidos) {
			this.apellidos = apellidos;
		}


		/**
		 * @return the Departamentos
		 */
		public Departamentos getDepartamentos() {
			return Departamentos;
		}


		/**
		 * @param Departamentos the Departamentos to set
		 */
		public void setDepartamentos(Departamentos Departamentos) {
			this.Departamentos = Departamentos;
		}


		//metodo toString
		@Override
		public String toString() {
			return "Empleados [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", Departamentos=" + Departamentos + "]";
		}
		
		
		
		
		
		
		
	

}