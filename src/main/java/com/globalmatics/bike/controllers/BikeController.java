package com.globalmatics.bike.controllers;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.globalmatics.bike.models.Bike;
import com.globalmatics.bike.services.BikeService;

@RestController
@RequestMapping("/api/v1/bikes")
public class BikeController {
	
	@Resource
	BikeService bikeservice;
	
	@GetMapping
	public List<Bike> list(){
		return bikeservice.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void create(@RequestBody Bike bike) {
			bikeservice.save(bike);
	}
	
	@GetMapping("/byId")
	public Bike get(@RequestBody Bike bike) {
		return bikeservice.getOne(bike);
	}
	
	@DeleteMapping("/deletebyId")
	public void delete(@RequestBody Bike bike) {
		bikeservice.deleteOne(bike);
	}
	
	
	@PutMapping("/updatebyId")
	public Bike update(@RequestBody Bike bike) {
		return bikeservice.update(bike);
	}
	
}
