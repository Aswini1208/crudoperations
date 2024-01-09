package com.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.dao.Citiesrepository;
import com.crud.entity.Cities;

@Service
public class CitiesService {
	@Autowired
	private Citiesrepository cityrepository ;
	
	public List<Cities> getallcities(){
		  List<Cities> allcities = cityrepository.findAll();  
		return allcities;
		
	}
	

}
