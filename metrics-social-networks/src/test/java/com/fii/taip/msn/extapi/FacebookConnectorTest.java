package com.fii.taip.msn.extapi;

import java.util.List;

import org.junit.Test;

import com.restfb.Connection;
import com.restfb.types.User;
import com.restfb.types.Thread;

public class FacebookConnectorTest {
	@Test
	public void expectUserDetails(){
		IConnector connector = new FacebookConnector();
	    User user = connector.GetUserDetails("");
	}
	
	@Test
	public void expectUserInbox(){
		IConnector connector = new FacebookConnector();
		Connection<Thread> threads = connector.GetUserInbox("");
	}
	
	@Test
	public void expectUserFriends(){
		IConnector connector = new FacebookConnector();
		Connection<User> friends = connector.GetUserFriends("");
	}

}
