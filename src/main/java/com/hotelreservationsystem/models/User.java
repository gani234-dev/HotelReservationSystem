package com.hotelreservationsystem.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {

	@Id
	private String user_id;
	private String user_Name;
	private String user_Email;
	private String user_Gen;
	private String user_Phone;
	private String user_City;
	private String user_Pincode;
	@Override
	public String toString() {
		return "User [" + (user_id != null ? "user_id=" + user_id + ", " : "")
				+ (user_Name != null ? "user_Name=" + user_Name + ", " : "")
				+ (user_Email != null ? "user_Email=" + user_Email + ", " : "")
				+ (user_Gen != null ? "user_Gen=" + user_Gen + ", " : "")
				+ (user_Phone != null ? "user_Phone=" + user_Phone + ", " : "")
				+ (user_City != null ? "user_City=" + user_City + ", " : "")
				+ (user_Pincode != null ? "user_Pincode=" + user_Pincode : "") + "]";
	}
	public User(String user_id, String user_Name, String user_Email, String user_Gen, String user_Phone,
			String user_City, String user_Pincode) {
		super();
		this.user_id = user_id;
		this.user_Name = user_Name;
		this.user_Email = user_Email;
		this.user_Gen = user_Gen;
		this.user_Phone = user_Phone;
		this.user_City = user_City;
		this.user_Pincode = user_Pincode;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_Name() {
		return user_Name;
	}
	public void setUser_Name(String user_Name) {
		this.user_Name = user_Name;
	}
	public String getUser_Email() {
		return user_Email;
	}
	public void setUser_Email(String user_Email) {
		this.user_Email = user_Email;
	}
	public String getUser_Gen() {
		return user_Gen;
	}
	public void setUser_Gen(String user_Gen) {
		this.user_Gen = user_Gen;
	}
	public String getUser_Phone() {
		return user_Phone;
	}
	public void setUser_Phone(String user_Phone) {
		this.user_Phone = user_Phone;
	}
	public String getUser_City() {
		return user_City;
	}
	public void setUser_City(String user_City) {
		this.user_City = user_City;
	}
	public String getUser_Pincode() {
		return user_Pincode;
	}
	public void setUser_Pincode(String user_Pincode) {
		this.user_Pincode = user_Pincode;
	}
	
	
}
