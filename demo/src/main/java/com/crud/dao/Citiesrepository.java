package com.crud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.entity.Cities;

public interface Citiesrepository extends JpaRepository<Cities, Integer> {

}
