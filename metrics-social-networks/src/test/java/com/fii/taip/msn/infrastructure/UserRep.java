package com.fii.taip.msn.infrastructure;

import java.util.List;

import com.fii.taip.msn.dbcom.FacebookUserRepository;
import com.fii.taip.msn.dbmodel.FacebookUser;

public class UserRep implements FacebookUserRepository {

	private int numberOfUsers;
	
	public void insertUser(FacebookUser user) {
		//nothing to do
		
	}

	public List<FacebookUser> allUsers() {
		return UserBuilder.generateUsersForIDs(ConversationBuilder.
				generateListOfUsers(numberOfUsers));
	}

	public int getNumberOfUsers() {
		return numberOfUsers;
	}

	public void setNumberOfUsers(int numberOfUsers) {
		this.numberOfUsers = numberOfUsers;
	}
}
