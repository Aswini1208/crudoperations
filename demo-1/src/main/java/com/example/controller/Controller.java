package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.City;
import com.example.service.Cityservice;

@RestController
@RequestMapping("/aswini")
public class Controller {
	@Autowired
       private Cityservice cityservice; 
	
	@GetMapping("/value")
	public List<City> getallcities(){
		  List<City> allcity = cityservice.getallcities();
		return allcity;
		  
		  
	}

}
