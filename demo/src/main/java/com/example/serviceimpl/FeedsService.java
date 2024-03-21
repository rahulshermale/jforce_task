package com.example.serviceimpl;

import java.util.List;

import com.example.entity.Feeds;

public interface FeedsService {

public void addPost(Feeds feed);
	
	public List<Feeds> getAllPost();
	
	public List<Feeds> findAllUsersWithAddress();
	
	public Feeds updatePost(Feeds feed,int id);
	
	public void deletById(int id);
	
	public void deletAllPost();
}
