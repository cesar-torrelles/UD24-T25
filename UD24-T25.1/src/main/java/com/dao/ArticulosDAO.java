package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dto.Articulos;

public interface ArticulosDAO extends JpaRepository<Articulos, Long>{

}