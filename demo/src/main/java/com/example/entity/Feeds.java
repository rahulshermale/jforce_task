package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Feeds {

	@Id
	private int id;
	private String post;
	
	private String name;

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

	public Feeds(int id, String post, String name) {
		super();
		this.id = id;
		this.post = post;
		this.name = name;
	}

	public Feeds() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
