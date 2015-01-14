package com.fii.taip.msn.dbcom.mongo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Repository;

import com.fii.taip.msn.dbcom.FacebookUserRepository;
import com.fii.taip.msn.dbmodel.FacebookUser;

@Repository
public class MongoDBFacebookUserRepository implements FacebookUserRepository {
	@Autowired
	private MongoOperations operations;

	public void insertUser(FacebookUser user) {
		operations.insert(user);
	}

	public List<FacebookUser> allUsers() {
		return operations.findAll(FacebookUser.class);
	}

}
