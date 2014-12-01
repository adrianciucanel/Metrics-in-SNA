package com.fii.taip.msn.dto;

import java.util.List;

public class FacebookUserDto {
	private String name;
	
	private String ageRange;
	
	private String school;
	
	private String education;
	
	private List<String> favoriteTeams;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAgeRange() {
		return ageRange;
	}

	public void setAgeRange(String ageRange) {
		this.ageRange = ageRange;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public List<String> getFavoriteTeams() {
		return favoriteTeams;
	}

	public void setFavoriteTeams(List<String> favoriteTeams) {
		this.favoriteTeams = favoriteTeams;
	}
	
	
}
