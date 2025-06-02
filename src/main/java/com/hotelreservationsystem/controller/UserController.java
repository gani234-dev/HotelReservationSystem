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
import com.hotelreservationsystem.models.User;
import com.hotelreservationsystem.services.HotelService;
import com.hotelreservationsystem.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService service;
	
	@PostMapping
	public User createHotel(@RequestBody User h) {
		return service.createUser(h);
	}
	@PostMapping("/all")
	public String createUserInBatch(@RequestBody List<User> h) {
		return service.createUserInBatch(h);
	}
	@GetMapping("/{id}")
	public User getUserById (@PathVariable String id) {
	 return service.getUserById(id);
	}
	@GetMapping
	public List<User> getUser () {
	 return service.getUser();
	}
	@PutMapping
	public User updateUser(@RequestBody User h) {
		System.out.println(h);
		return service.updateUser(h);
	}
	@DeleteMapping("/{id}")
	public String updateUser(@PathVariable String id) {
		return service.deleteUser(id);
	}

}
