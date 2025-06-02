package com.hotelreservationsystem.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelreservationsystem.exceptions.ResourceNotFoundException;
import com.hotelreservationsystem.models.Hotels;
import com.hotelreservationsystem.models.User;
import com.hotelreservationsystem.repo.UserRepo;
@Service
public class UserService {

	@Autowired
	private UserRepo repo;
	
	public User createUser(User l) {
		l.setUser_id(UUID.randomUUID().toString());
		return repo.save(l);
	}
	public String createUserInBatch(List<User> l) {
		for(int i=0;i<l.size();i++) {
			l.get(i).setUser_id(UUID.randomUUID().toString());
		}
		repo.saveAll(l);
		return ""+l.size()+" Users saved success";
	}
	
	public List<User> getUser() {
		return repo.findAll();
	}
	
	public User  getUserById(String id) {
		User h=repo.findById(id).orElseThrow(()-> new 
				ResourceNotFoundException()
				);
		return h;
	}
	
	public User updateUser(User user) {
		User h=repo.findById(user.getUser_id()).orElseThrow(()-> new 
				ResourceNotFoundException()
				);
		h.setUser_Name(user.getUser_Name());
		
		return repo.save(h);
		
	}
	public String deleteUser(String id) {
		User h=repo.findById(id).orElseThrow(()-> new 
				ResourceNotFoundException()
				);
		repo.delete(h);
		
		return "User Deleted";
		
	}
}
