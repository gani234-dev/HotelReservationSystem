package com.hotelreservationsystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelreservationsystem.exceptions.ResourceNotFoundException;
import com.hotelreservationsystem.models.Hotels;
import com.hotelreservationsystem.repo.HotelRepo;

@Service
public class HotelService {

	@Autowired
	private HotelRepo repo;
	
	public Hotels createHotel(Hotels l) {
		return repo.save(l);
	}
	public String createHoteInBatch(List<Hotels> l) {
		repo.saveAll(l);
		return ""+l.size()+" hotels saved success";
	}
	
	public List<Hotels> getHotels() {
		return repo.findAll();
	}
	
	public Hotels  getHotelById(String id) {
		Hotels h=repo.findById(id).orElseThrow(()-> new 
				ResourceNotFoundException()
				);
		return h;
	}
	
	public Hotels updateHotel(Hotels hotel) {
		Hotels h=repo.findById(hotel.getHotel_id()).orElseThrow(()-> new 
				ResourceNotFoundException()
				);
		h.setHotel_Name(hotel.getHotel_Name());
		
		return repo.save(h);
		
	}
	public String deleteHotel(String id) {
		Hotels h=repo.findById(id).orElseThrow(()-> new 
				ResourceNotFoundException()
				);
		repo.delete(h);
		
		return "Hotel Deleted";
		
	}
}
