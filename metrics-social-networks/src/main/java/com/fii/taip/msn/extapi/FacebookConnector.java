package com.fii.taip.msn.extapi;

import java.util.Dictionary;
import java.util.List;

import com.restfb.Connection;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.types.User;
import com.restfb.types.Thread;


public class FacebookConnector implements IConnector {
	
    private final String accessTokens = "CAACEdEose0cBAEMferGtwImru4FZCfZAv8RiZAFGkdgG1RSOHuOH45WJozYtKRiBChEvTJI2F7qu0H1M0wkfxSWa5icllRI4IXyC3BZBWPV4tKctm0rRQW3zFSvJSY6nZBaiBU8fJw4v8ZAO5CMpCxMnmV5xvfolo69m4P3rowjeJVhFF3JL5KqkZCevlsYjPIiq0FZBFe4KgUZAbWmscnw15buBA9UWZCatMZD";
    private FacebookClient facebookClient = new DefaultFacebookClient(accessTokens);
    
	public Connection<User> GetUserFriends(String username) {
		Connection<User> myFriends = facebookClient.fetchConnection("me/friends", User.class);
		return myFriends;
	}

	public Connection<Thread> GetUserInbox(String username) {
		Connection<Thread> myThread = facebookClient.fetchConnection("me/inbox", Thread.class);
		return myThread;
	}

	public String getAccessTokens() {
		return accessTokens;
	}

	public User GetUserDetails(String username) {
		User user = facebookClient.fetchObject("me", User.class);
		return user;
	}

}
