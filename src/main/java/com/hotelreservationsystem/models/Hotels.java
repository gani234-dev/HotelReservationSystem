package com.hotelreservationsystem.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Hotels {

	@Id
	private String hotel_id;
	private String hotel_Name;
	private String hotel_Ratings;
	private int hotel_Rooms_Avail;
	public String getHotel_id() {
		return hotel_id;
	}
	public void setHotel_id(String hotel_id) {
		this.hotel_id = hotel_id;
	}
	public String getHotel_Name() {
		return hotel_Name;
	}
	public void setHotel_Name(String hotel_Name) {
		this.hotel_Name = hotel_Name;
	}
	public String getHotel_Ratings() {
		return hotel_Ratings;
	}
	public void setHotel_Ratings(String hotel_Ratings) {
		this.hotel_Ratings = hotel_Ratings;
	}
	public int getHotel_Rooms_Avail() {
		return hotel_Rooms_Avail;
	}
	public void setHotel_Rooms_Avail(int hotel_Rooms_Avail) {
		this.hotel_Rooms_Avail = hotel_Rooms_Avail;
	}
	public Hotels(String hotel_id, String hotel_Name, String hotel_Ratings, int hotel_Rooms_Avail) {
		super();
		this.hotel_id = hotel_id;
		this.hotel_Name = hotel_Name;
		this.hotel_Ratings = hotel_Ratings;
		this.hotel_Rooms_Avail = hotel_Rooms_Avail;
	}
	public Hotels() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Hotels [hotel_id=" + hotel_id + ", hotel_Name=" + hotel_Name + ", hotel_Ratings=" + hotel_Ratings
				+ ", hotel_Rooms_Avail=" + hotel_Rooms_Avail + "]";
	}
	
	
}
