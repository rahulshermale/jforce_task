package com.example.entity;



import java.time.LocalDate;


//import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Feeds {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int feedId;
	
	
	private int id;
	
	
	private String post;
	
	
	private String name;
	
	private LocalDate date;

	
	
	
	
	public Feeds(int feedId, int id, String post, String name, LocalDate date) {
		super();
		this.feedId = feedId;
		this.id = id;
		this.post = post;
		this.name = name;
		this.date = date;
	}

	public int getFeedId() {
		return feedId;
	}

	public void setFeedId(int feedId) {
		this.feedId = feedId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	

	public Feeds() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
}
