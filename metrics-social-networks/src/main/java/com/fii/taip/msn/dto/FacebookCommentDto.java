package com.fii.taip.msn.dto;

import java.util.Date;

public class FacebookCommentDto {
	
	private long id;
	
	private FacebookUserDto from;
	
	private String message;
	
	private Date createdTime;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public FacebookUserDto getFrom() {
		return from;
	}

	public void setFrom(FacebookUserDto from) {
		this.from = from;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}
	
	
}
