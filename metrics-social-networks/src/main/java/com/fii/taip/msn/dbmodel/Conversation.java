package com.fii.taip.msn.dbmodel;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.TypeAlias;

import com.restfb.types.Message;
import com.restfb.types.NamedFacebookType;
import com.restfb.types.Thread;

@TypeAlias("Conversation")
public class Conversation {
	private List<FacebookMessage> messages;

	private String ownerId;
	
	private List<String> toList;
	
	public Conversation(){
		//default used by MongoDB
	}
	
	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public List<String> getToList() {
		return toList;
	}

	public void setToList(List<String> toList) {
		this.toList = toList;
	}

	public Conversation(Thread thread,FacebookUser user){
		this.ownerId=user.getId();
		messages=new ArrayList<FacebookMessage>();
		for(Message message : thread.getComments()){
			messages.add(new FacebookMessage(message));
		}	
		toList=new ArrayList<String>();
		for(NamedFacebookType threadReceiver: thread.getTo()){
			if(!this.ownerId.equals(threadReceiver.getId())) {
				toList.add(threadReceiver.getId());
			}
		}
	}
	
	public List<FacebookMessage> getMessages() {
		return messages;
	}

	public void setMessages(List<FacebookMessage> messages) {
		this.messages = messages;
	} 
}
