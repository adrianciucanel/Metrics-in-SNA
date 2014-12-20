package com.fii.taip.msn.extapi;

import java.util.Dictionary;
import java.util.List;

import com.restfb.Connection;
import com.restfb.types.Thread;
import com.restfb.types.User;

public interface IConnector {

	User GetUserDetails(String accesToken);

	Connection<User> GetUserFriends(String accesToken);

	Connection<Thread> GetUserInbox(String accesToken);

}
