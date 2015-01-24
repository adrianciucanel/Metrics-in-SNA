package com.fii.taip.msn.infrastructure;

import java.util.List;

import com.fii.taip.msn.dbcom.FacebookConversationRepository;
import com.fii.taip.msn.dbmodel.Conversation;
import com.fii.taip.msn.dbmodel.FacebookUser;
import com.restfb.Connection;
import com.restfb.types.Thread;

public class ConversationRep implements FacebookConversationRepository {

	private int numberOfConversations;
	
	public List<Conversation> insert(FacebookUser owner,
			Connection<Thread> dtoList) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Conversation> allConversations() {
		return ConversationBuilder.generateConversations(numberOfConversations);
	}

	public List<Conversation> get(FacebookUser owner) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Conversation> get(FacebookUser owner, FacebookUser participant) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getNumberOfConversations() {
		return numberOfConversations;
	}

	public void setNumberOfConversations(int numberOfConversations) {
		this.numberOfConversations = numberOfConversations;
	}
}
