package com.crud.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.Entity.Cities;

import demo.crud.service.CitiesService;
@RestController
@RequestMapping("/Neeraj")
public class Controller {
	
	private CitiesService citiesService;
	
	public List<Cities> getallcities(){
		
		List<Cities> allcities = citiesService.getallcities();
		return  allcities;
		
	
	
	}

}
