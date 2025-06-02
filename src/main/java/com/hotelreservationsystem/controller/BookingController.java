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

import com.hotelreservationsystem.models.Booking;
import com.hotelreservationsystem.models.User;
import com.hotelreservationsystem.services.BookingService;
import com.hotelreservationsystem.services.UserService;

@RestController
@RequestMapping("/booking")
public class BookingController {

	@Autowired
	private BookingService service;
	
	@PostMapping
	public Booking createBooking(@RequestBody Booking h) {
		return service.createBooking(h);
	}
	@PostMapping("/all")
	public String createBookingInBatch(@RequestBody List<Booking> h) {
		return service.createBookingInBatch(h);
	}
	@GetMapping("/hotel/{id}")
	public List<Booking> getBookingByHotelId (@PathVariable String id) {
	 return service.getBookingsByHotelId(id);
	}
	@GetMapping("/user/{id}")
	public List<Booking> getBookingByUserId (@PathVariable String id) {
	 return service.getBookingsByUserID(id);
	}
	@GetMapping("/{id}")
	public Booking getBookingById (@PathVariable String id) {
	 return service.getBookingById(id);
	}
	@GetMapping
	public List<Booking> getBooking () {
	 return service.getBookings();
	}
	@PutMapping
	public Booking updateBooking(@RequestBody Booking h) {
		System.out.println(h);
		return service.updateBooking(h);
	}
	@DeleteMapping("/{id}")
	public String updateBooking(@PathVariable String id) {
		return service.deleteBooking(id);
	}
}
