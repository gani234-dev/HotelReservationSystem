package com.hotelreservationsystem.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotelreservationsystem.models.Booking;

@Repository
public interface BookingRepo extends JpaRepository<Booking, String> {

	    List<Booking> findByBookingUserId(String bookingUserId);
	    List<Booking> findByBookingHotelId(String bookingHotelId);
	}


