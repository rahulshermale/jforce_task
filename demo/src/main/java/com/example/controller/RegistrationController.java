package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Login;
import com.example.serviceimpl.registerImpl;

@RestController
@CrossOrigin("*")
public class RegistrationController {

	@Autowired
	private registerImpl registerService;

	@GetMapping(value = "/api/getall")
	public List<Login> getAll() {

		return registerService.GetAll();

	}

	@PostMapping("/api/add")
	public void registerDAta(@RequestBody Login login) {

		registerService.AddUser(login);

	}
//	@GetMapping("/api/getbyid/{id}")
//	public List<Login> login(@PathVariable int id){
//	
//		registerService.userlogin(String user);
//	
//	}
//	
	@GetMapping(value = "api/userlogin/{uname}")
	public Optional<Login> slogin(@PathVariable String uname) {
//
		Optional<Login> s = registerService.userlogin(uname);
		return s;
		
		
	}
	
	
	
	
}
