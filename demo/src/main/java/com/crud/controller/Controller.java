package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.entity.Cities;
import com.crud.service.CitiesService;

@RestController
@RequestMapping("/demo")
public class Controller {

	@Autowired
	private CitiesService citiesService;

	@GetMapping("/all")
	public List<Cities> getallcities() {
		List<Cities> allcities = citiesService.getallcities();
		return allcities;

	}

}
