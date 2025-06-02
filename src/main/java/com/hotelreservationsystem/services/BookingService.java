package com.hotelreservationsystem.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelreservationsystem.exceptions.ResourceNotFoundException;
import com.hotelreservationsystem.models.Booking;
import com.hotelreservationsystem.models.Hotels;
import com.hotelreservationsystem.models.User;
import com.hotelreservationsystem.repo.BookingRepo;
import com.hotelreservationsystem.repo.UserRepo;

@Service
public class BookingService {

	@Autowired
	private BookingRepo repo;
	@Autowired
	private HotelService hotelService;
	
	public Booking createBooking(Booking l) {
		l.setBooking_id(UUID.randomUUID().toString());
		Hotels h=hotelService.getHotelById(l.getBookingHotelId());
		int room=h.getHotel_Rooms_Avail();
		h.setHotel_Rooms_Avail(--room);
		hotelService.createHotel(h);
		return repo.save(l);
	}
	public String createBookingInBatch(List<Booking> l) {
		for(int i=0;i<l.size();i++) {
			l.get(i).setBooking_id(UUID.randomUUID().toString());
		}
		repo.saveAll(l);
		return ""+l.size()+" Booking saved success";
	}
	
	public List<Booking> getBookingsByUserID(String id) {
		return repo.findByBookingUserId(id);
	}
	public List<Booking> getBookingsByHotelId(String id) {
		return repo.findByBookingHotelId(id);
	}
	public List<Booking> getBookings() {
		return repo.findAll();
	}
	
	public Booking  getBookingById(String id) {
		Booking h=repo.findById(id).orElseThrow(()-> new 
				ResourceNotFoundException()
				);
		return h;
	}
	
	public Booking updateBooking(Booking book) {
		Booking h=repo.findById(book.getBooking_id()).orElseThrow(()-> new 
				ResourceNotFoundException()
				);
		h.setCheckIn_date(book.getCheckIn_date());
		
		return repo.save(h);
		
	}
	public String deleteBooking(String id) {
		Booking h=repo.findById(id).orElseThrow(()-> new 
				ResourceNotFoundException()
				);
		Hotels hotel=hotelService.getHotelById(h.getBookingHotelId());
		int room=hotel.getHotel_Rooms_Avail();
		hotel.setHotel_Rooms_Avail(++room);
		hotelService.createHotel(hotel);
		
		repo.delete(h);
		
		return "Booking Cancelled ";
		
	}
	
	
}
