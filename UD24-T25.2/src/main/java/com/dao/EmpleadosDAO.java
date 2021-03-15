package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dto.Empleados;

public interface EmpleadosDAO extends JpaRepository<Empleados, Long>{

}