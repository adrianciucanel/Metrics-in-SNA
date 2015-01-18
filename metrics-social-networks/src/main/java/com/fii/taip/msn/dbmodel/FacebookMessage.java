package com.fii.taip.msn.dbmodel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.restfb.types.Message;
import com.restfb.types.NamedFacebookType;

public class FacebookMessage {
	private String ownerId;
	private List<String> receiversId;
	private String message;
	private Date createdTime;
	
	public FacebookMessage(){
		
	}
	
	public FacebookMessage(Message message){
		this.ownerId = message.getFrom().getId();
		this.message = message.getMessage();
		this.createdTime = message.getCreatedTime();
		receiversId=new ArrayList<String>();
		for(NamedFacebookType receiver : message.getTo()){
			receiversId.add(receiver.getId());
		}
	}
	public String getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}
	public List<String> getReceiversId() {
		return receiversId;
	}
	public void setReceiversId(List<String> receiversId) {
		this.receiversId = receiversId;
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
