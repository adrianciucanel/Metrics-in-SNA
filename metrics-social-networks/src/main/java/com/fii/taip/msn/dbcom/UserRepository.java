package com.fii.taip.msn.dbcom;

import com.fii.taip.msn.dbmodel.FacebookUser;

public interface UserRepository {

	/**
	 * Create and insert a user in data base.
	 * 
	 * @param user
	 *            data transfer object that contains informations about the user
	 *            that will be created in data base.
	 * @return the created user.
	 */
	void insertUser(FacebookUser user);

}
