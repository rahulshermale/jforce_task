package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.entity.PostDetailsAndUserDetails;
import com.example.serviceimpl.PostAndUserImplementation;

@RestController
@CrossOrigin("*")
public class PostUserController {
	
	@Autowired
	private PostAndUserImplementation postuserService;
//	
	
	@GetMapping(value = "/api/getallpost")
	public List<PostDetailsAndUserDetails> getAll() {

		return postuserService.GetAll();

		
	}
	
	@GetMapping(value = "/api/getpostid/{id}")
	public Optional<PostDetailsAndUserDetails> getuserById(@PathVariable int id) {

		return postuserService.getuserById(id);

	}
	

	 @GetMapping(value = "api/getpost/{username}")
	 public List<PostDetailsAndUserDetails> getUserbyName(@PathVariable String username)
	 {
		return postuserService.getUserByName(username);
	 }
	 

		@PostMapping("/api/addpostuser")
		public void registerfeed(@RequestBody PostDetailsAndUserDetails login) { 

		System.err.println(1);
		
			postuserService.AddUser(login);
			System.err.println(login.toString());
			
			

		}
		

		@PutMapping("/api/updatepost/{id}")
	    public PostDetailsAndUserDetails updateUser(@PathVariable int id, @RequestBody PostDetailsAndUserDetails user) {
	        return postuserService.updateUser(id, user);
	    }
		
		

@DeleteMapping("/api/deleteuserpost/{id}")
public void deleteById(@PathVariable int id) {
	
	postuserService.deleteById(id);
	
	
	
}

}
