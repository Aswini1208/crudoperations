package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.City;

public interface Cityrepository extends JpaRepository<City, Integer>{

}
