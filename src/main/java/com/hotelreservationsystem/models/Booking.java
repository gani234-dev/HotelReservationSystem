package com.hotelreservationsystem.models;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Booking {

	@Id
	private String booking_id;
	private String bookingUserId;
	private String bookingHotelId;
	private Date checkIn_date;
	private Date checkOut_date;
	public String getBooking_id() {
		return booking_id;
	}
	public void setBooking_id(String booking_id) {
		this.booking_id = booking_id;
	}
	public String getBookingUserId() {
		return bookingUserId;
	}
	public void setBookingUserId(String bookingUserId) {
		this.bookingUserId = bookingUserId;
	}
	public String getBookingHotelId() {
		return bookingHotelId;
	}
	public void setBookingHotelId(String bookingHotelId) {
		this.bookingHotelId = bookingHotelId;
	}
	public Date getCheckIn_date() {
		return checkIn_date;
	}
	public void setCheckIn_date(Date checkIn_date) {
		this.checkIn_date = checkIn_date;
	}
	public Date getCheckOut_date() {
		return checkOut_date;
	}
	public void setCheckOut_date(Date checkOut_date) {
		this.checkOut_date = checkOut_date;
	}
	public Booking(String booking_id, String bookingUserId, String bookingHotelId, Date checkIn_date,
			Date checkOut_date) {
		super();
		this.booking_id = booking_id;
		this.bookingUserId = bookingUserId;
		this.bookingHotelId = bookingHotelId;
		this.checkIn_date = checkIn_date;
		this.checkOut_date = checkOut_date;
	}
	@Override
	public String toString() {
		return "Booking [" + (booking_id != null ? "booking_id=" + booking_id + ", " : "")
				+ (bookingUserId != null ? "bookingUserId=" + bookingUserId + ", " : "")
				+ (bookingHotelId != null ? "bookingHotelId=" + bookingHotelId + ", " : "")
				+ (checkIn_date != null ? "checkIn_date=" + checkIn_date + ", " : "")
				+ (checkOut_date != null ? "checkOut_date=" + checkOut_date : "") + "]";
	}
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
