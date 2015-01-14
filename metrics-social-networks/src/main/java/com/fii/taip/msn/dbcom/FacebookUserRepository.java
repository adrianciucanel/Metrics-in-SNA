package com.fii.taip.msn.dbcom;

import java.util.List;

import com.fii.taip.msn.dbmodel.FacebookUser;

public interface FacebookUserRepository {

	/**
	 * Create and insert a user in data base.
	 * 
	 * @param user
	 *            data transfer object that contains informations about the user
	 *            that will be created in data base.
	 * @return the created user.
	 */
	void insertUser(FacebookUser user);
	
	/**
	 * Get all users from DB.
	 * @return a list which contains all users.
	 */
	List<FacebookUser> allUsers();

}
