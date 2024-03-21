package com.example.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Login;
import com.example.repository.RegisterRepo;

@Service
public class registerImpl implements registerService {

	@Autowired
	private RegisterRepo regirepo;
	
	@Override
	public List<Login> GetAll() {
		// TODO Auto-generated method stub
		return regirepo.findAll();
	}

	@Override
	public void AddUser(Login login) {
		// TODO Auto-generated method stub
		regirepo.save(login);
	
	}

	@Override
	public Login deletUserByid(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Optional<Login> userlogin(String name) {
		// TODO Auto-generated method stub
		return regirepo.findByUsername(name);
	}

}
