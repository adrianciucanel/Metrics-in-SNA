package com.fii.taip.msn.extapi;

import org.springframework.stereotype.Component;

import com.restfb.Connection;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.types.Thread;
import com.restfb.types.User;

@Component
public class FacebookConnector implements IConnector {
	
    
	public Connection<User> GetUserFriends(String accessToken) {
    	FacebookClient facebookClient = new DefaultFacebookClient(accessToken);
		Connection<User> myFriends = facebookClient.fetchConnection("me/friends", User.class);
		return myFriends;
	}

	public Connection<Thread> GetUserInbox(String accessToken) {
		FacebookClient facebookClient = new DefaultFacebookClient(accessToken);
		Connection<Thread> myThread = facebookClient.fetchConnection("me/inbox", Thread.class);
		return myThread;
	}

	public User GetUserDetails(String accessToken) {
		FacebookClient facebookClient = new DefaultFacebookClient(accessToken);
		User user = facebookClient.fetchObject("me", User.class);
		return user;
	}

}
