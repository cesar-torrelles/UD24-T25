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
@Table(name="Departamentos")//en caso que la tabla sea diferente
public class Departamentos  {
 
	//Atributos de entidad Departamentos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private Long id;
	
	@Column(name = "nombre")//no hace falta si se llama igual
	private String nombre;
	
	@Column(name = "presupuesto")//no hace falta si se llama igual
	private int presupuesto;
	

	
    @OneToMany
    @JoinColumn(name="id")
    private List<Empleados> Empleados;
	
	//Constructores
	
	public Departamentos() {
	
	}

	/**
	 * @param id
	 * @param nombre
	 * @param apellido
	 * @param direccion
	 * @param dni
	 * @param fecha
	 */
	public Departamentos(Long id, String nombre, int presupuesto) {
		
		//super();
		this.id = id;
		this.nombre = nombre;
		this.presupuesto = presupuesto;
	}

	
	//Getters y Setters
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Empleados")
	public List<Empleados> getEmpleados() {
		return Empleados;
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

	public int getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(int presupuesto) {
		this.presupuesto = presupuesto;
	}

	/**
	 * @param Empleados the Empleados to set
	 */
	public void setEmpleados(List<Empleados> Empleados) {
		this.Empleados = Empleados;
	}

	
	
	
	
	
}