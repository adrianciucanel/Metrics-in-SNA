package com.fii.taip.msn.dbcom.mongo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Repository;

import com.fii.taip.msn.dbcom.FacebookConversationRepository;
import com.fii.taip.msn.dbmodel.Conversation;
import com.fii.taip.msn.dbmodel.FacebookUser;
import com.restfb.Connection;
import com.restfb.types.Thread;

@Repository
public class MongoDBConversationRepository implements FacebookConversationRepository {

	@Autowired
	private MongoOperations operations;
	
	public List<Conversation> insert(FacebookUser owner,
			Connection<Thread> dtoList) {
		List<Conversation> conversations = new ArrayList<Conversation>();
		for (Thread thread : dtoList.getData()) {
			conversations.add(new Conversation(thread, owner));
		}
		operations.insert(conversations, Conversation.class);
		return conversations;
	}

	public List<Conversation> get(FacebookUser owner) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Conversation> get(FacebookUser owner, FacebookUser participant) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Conversation> allConversations() {
		return operations.findAll(Conversation.class);
	}

}
