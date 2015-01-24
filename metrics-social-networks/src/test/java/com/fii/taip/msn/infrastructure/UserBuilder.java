package com.fii.taip.msn.infrastructure;

import java.util.ArrayList;
import java.util.List;

import com.fii.taip.msn.dbmodel.Conversation;
import com.fii.taip.msn.dbmodel.FacebookUser;

public class UserBuilder {
	
	public static List<FacebookUser> buildUsers(List<Conversation> conversations) {
		List<String> userIds = new ArrayList<String>();
		for(Conversation conversation : conversations) {
			for(String userID : conversation.getToList()) {
				if (!userIds.contains(userID)) {
					userIds.add(userID);
				}
			}
		}
		return generateUsersForIDs(userIds);
	}
	
	public static List<FacebookUser> generateUsersForIDs(List<String> userIDs) {
		List<FacebookUser> genereatedUsers = new ArrayList<FacebookUser>();
		for(String userID : userIDs) {
			FacebookUser generatedUser = new FacebookUser();
			generatedUser.setId(userID);
			genereatedUsers.add(generatedUser);
		}
		return genereatedUsers;
	}
}
