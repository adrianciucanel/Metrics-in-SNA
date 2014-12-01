package com.fii.taip.msn.dbcom;

import com.fii.taip.msn.dbmodel.User;
import com.fii.taip.msn.dto.FacebookUserDto;

public interface UserRepository {

	/**
	 * Create and insert a user in data base.
	 * 
	 * @param dto
	 *            data transfer object that contains informations about the user
	 *            that will be created in data base.
	 * @return the created user.
	 */
	User createUser(FacebookUserDto dto);

	/**
	 * Get the user by its ID.
	 * 
	 * @param id
	 *            the ID of the user that will be returned.
	 * @return the user that have the specified ID
	 */
	User getUser(long id);

	/**
	 * Get the user by its email.
	 * 
	 * @param email
	 *            the email address of the user that will be returned.
	 * @return the user that has the specified email.
	 */
	User getUser(String email);
}
