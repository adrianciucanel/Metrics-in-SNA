package com.fii.taip.msn.dbmodel;

import java.util.ArrayList;
import java.util.List;

import com.fii.taip.msn.dto.FacebookConversationDto;
import com.fii.taip.msn.dto.FacebookUserDto;

public class Conversation {
	private User owner;
	private List<User> participants;

	public Conversation(User owner, FacebookConversationDto dto) {
		this.owner = owner;
		List<User> participants = new ArrayList<User>();
		for (FacebookUserDto userDto : dto.getParticipants()) {
			participants.add(new User(userDto));
		}
		this.participants = participants;
	}
	
	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}

	public List<User> getParticipants() {
		return participants;
	}

	public void setParticipants(List<User> participants) {
		this.participants = participants;
	}

}
