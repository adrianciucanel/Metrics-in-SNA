package com.fii.taip.msn.dbmodel;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;

import com.restfb.types.User;

@TypeAlias("FacebookUser")
public class FacebookUser {
	
	public static FacebookUser isUserWithIdInList(String id, List<FacebookUser> users) {
		FacebookUser userToReturn = null;
		for (FacebookUser user : users) {
			if(user.getId().equals(id)) {
				userToReturn = user;
				break;
			}
		}
		return userToReturn;
	}
	/*
	 * Composite pattern is used where we need to treat a group of objects in
	 * similar way as a single object. Composite pattern composes objects in
	 * term of a tree structure to represent part as well as whole hierarchy .
	 * This type of design pattern comes under structural pattern as this
	 * pattern creates a tree structure of group of objects.
	 */
	@Id
	private String id;
	private String name;
	private int age;
	private String email;                              
	private String gender;

	// constructor
	public FacebookUser(User dto) {
		this.name = dto.getName();
		this.email =dto.getEmail();
		this.id = dto.getId();
		this.gender = dto.getGender();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

}
