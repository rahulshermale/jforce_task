package com.example.serviceimpl;

import java.util.List;
import java.util.Optional;

import com.example.entity.Login;

public interface registerService {

	public List<Login> GetAll();
	public void AddUser(Login login);
	public Login deletUserByid(int id);
	Optional<Login> userlogin(String name);
	
	
	
}
