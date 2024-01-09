package com.curd.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.Entity.Cities;

public interface Citiesrepository extends JpaRepository<Cities, Integer> {

}
