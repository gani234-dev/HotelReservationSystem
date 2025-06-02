package com.hotelreservationsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotelreservationsystem.models.Hotels;
import com.hotelreservationsystem.services.HotelService;

@RestController
@RequestMapping("/hotel")
public class HotelController {

	@Autowired
	private HotelService service;
	
	@PostMapping
	public Hotels createHotel(@RequestBody Hotels h) {
		return service.createHotel(h);
	}
	@PostMapping("/all")
	public String createHotelInBatch(@RequestBody List<Hotels> h) {
		return service.createHoteInBatch(h);
	}
	@GetMapping("/{id}")
	public Hotels getHotelsById (@PathVariable String id) {
	 return service.getHotelById(id);
	}
	@GetMapping
	public List<Hotels> getHotels () {
	 return service.getHotels();
	}
	@PutMapping
	public Hotels updateHotel(@RequestBody Hotels h) {
		System.out.println(h);
		return service.updateHotel(h);
	}
	@DeleteMapping("/{id}")
	public String updateHotel(@PathVariable String id) {
		return service.deleteHotel(id);
	}
}
