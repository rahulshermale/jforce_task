package com.example.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Feeds;
import com.example.repository.FeedsRepository;

@Service
public class FeedsImplementation implements FeedsService{

	@Autowired
	private FeedsRepository feedpost;
	@Override
	public void addPost(Feeds feed) {
		// TODO Auto-generated method stub
		feedpost.save(feed);
	}

	@Override
	public List<Feeds> getAllPost() {
		// TODO Auto-generated method stub
		return feedpost.findAll();
	}



	@Override
	public Feeds updatePost(Feeds feed, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletById(int id) {
		 feedpost.deleteById(id);
	}

	@Override
	public void deletAllPost() {
		// TODO Auto-generated method stub
		feedpost.deleteAll();
	}

	@Override
	public List<Feeds> findAllUsersWithAddress() {
		// TODO Auto-generated method stub
		
		
		return feedpost.findAll();
	}

}
