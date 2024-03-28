package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Feeds;
import com.example.serviceimpl.FeedsImplementation;

@RestController
@CrossOrigin("*")
public class FeedsController {
	@Autowired
	private FeedsImplementation feedimpl;

	@GetMapping(value = "/api/getpost")
	public List<Feeds> getAllPost() {
		// TODO Auto-generated method stub
		return feedimpl.getAllPost();
	}

	
	@GetMapping(value = "/api/get")
	public List<Feeds> findAllUsersWithAddress() {
		// TODO Auto-generated method stub
		return feedimpl.findAllUsersWithAddress();
	}

	@PostMapping("api/addpost")
	public void addPost(@RequestBody Feeds feed) {
		
		// TODO Auto-generated method stub
		feedimpl.addPost(feed);
	}
	

	@DeleteMapping("api/deletebyid/{id}")
	public void deletbyId(@PathVariable int id) {
		// TODO Auto-generated method stub
		
		System.err.println(id);
		feedimpl.deletById(id);
	}
	
	@DeleteMapping("api/deleteallpost/")
	public void deletAllPost() {
		// TODO Auto-generated method stub
		feedimpl.deletAllPost();
		
		
		
	}
	
	@DeleteMapping("/api/delete/{id}")
    public String deleteUserByUsername(@PathVariable int id) {
		feedimpl.deleteUserByUsername(id);
        return "User with username " + id + " has been deleted successfully.";
    }
	
}
