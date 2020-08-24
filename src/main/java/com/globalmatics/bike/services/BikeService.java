package com.globalmatics.bike.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globalmatics.bike.models.Bike;
import com.globalmatics.bike.repository.BikeRepository;

@Service
public class BikeService {
	@Autowired
	private BikeRepository bikeRepository;
	
	public void save(Bike bike) {
		if(bike==null) {
			System.out.println("Null object pass by controller");
		}
		bikeRepository.save(bike);
	}

	public List<Bike> findAll() {
		// TODO Auto-generated method stub
		return bikeRepository.findAll();
	}
	
	public Bike getOne(Bike bike) {
		Optional<Bike> dbBike = bikeRepository.findById(bike.getId());
		Bike b=null;
		if(dbBike.isPresent()) {
			if(bike.getId()!=null) {
				b=dbBike.get();
				return b;
			}
			
		}
		return bike;
		
		
	}
	
	public void deleteOne(Bike bike) {
		bikeRepository.deleteById(bike.getId());
	}
	
	public Bike update(Bike bike) {
		Optional<Bike> dbBike = bikeRepository.findById(bike.getId());
		Bike b=null;
		if(dbBike.isPresent()) {
			if(bike.getEmail()!=null) {
				b=dbBike.get();
				b.setEmail(bike.getEmail());
				bikeRepository.save(b);
			}
		}
		return b;
	}

	
}
