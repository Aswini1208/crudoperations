package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.Cityrepository;
import com.example.entity.City;
@Service
public class Cityservice {
	@Autowired
	private Cityrepository cityrepository;
	
	public List<City> getallcities(){
		List<City> allcity = cityrepository.findAll();
		return allcity;
		 
	}

}
