package com.fii.taip.msn.infrastructure;

import java.util.ArrayList;
import java.util.List;

import com.fii.taip.msn.dbmodel.Conversation;
import com.fii.taip.msn.dbmodel.FacebookMessage;

public class ConversationBuilder {
	
	
	public static List<Conversation> generateConversations(int numberOfConversations) {
		List<String> users = generateListOfUsers(numberOfConversations);
		List<Conversation> generatedConversations = new ArrayList<Conversation>();
		for (int i = 0; i<numberOfConversations; i++) {
			Conversation conversation = new Conversation();
			conversation.setMessages(new ArrayList<FacebookMessage>());
			conversation.setOwnerId(users.get(i));
			conversation.setToList(users.subList(0, i));
			generatedConversations.add(conversation);
		}
		return generatedConversations;
	}
	
	public static List<String>generateListOfUsers(int numberOfUsers) {
		List<String> users = new ArrayList<String>();
		for (int i = 0; i<numberOfUsers; i++) {
			users.add("user" + String.valueOf(i));
		}
		return users;
	}
}
