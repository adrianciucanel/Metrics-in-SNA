package com.fii.taip.msn.dto;

import java.util.Date;
import java.util.List;

public class FacebookConversationDto {
	
	private long id;
	
	private List<FacebookUserDto> participants;
	
	private Date updatedTime;
	
	private List<FacebookCommentDto> comments;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<FacebookUserDto> getParticipants() {
		return participants;
	}

	public void setParticipants(List<FacebookUserDto> participants) {
		this.participants = participants;
	}

	public Date getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}

	public List<FacebookCommentDto> getComments() {
		return comments;
	}

	public void setComments(List<FacebookCommentDto> comments) {
		this.comments = comments;
	}
	
	
}
