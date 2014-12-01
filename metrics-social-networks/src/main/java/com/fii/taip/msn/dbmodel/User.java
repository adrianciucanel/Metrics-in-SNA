package com.fii.taip.msn.dbmodel;

import java.util.List;

import com.fii.taip.msn.dto.FacebookUserDto;

public class User {
	/*
	 * Composite pattern is used where we need to treat a group of objects in
	 * similar way as a single object. Composite pattern composes objects in
	 * term of a tree structure to represent part as well as whole hierarchy .
	 * This type of design pattern comes under structural pattern as this
	 * pattern creates a tree structure of group of objects.
	 */

	private long id;
	private String name;
	private int age;
	private String email;                              
	private String gender;
	private List<User> friends;

	// constructor
	public User(FacebookUserDto dto) {
		this.name = dto.getName();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void add(User e) {
		friends.add(e);
	}

	public void remove(User e) {
		friends.remove(e);
	}

	public List<User> getFriends() {
		return friends;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setFriends(List<User> friends) {
		this.friends = friends;
	}
	
	

}
