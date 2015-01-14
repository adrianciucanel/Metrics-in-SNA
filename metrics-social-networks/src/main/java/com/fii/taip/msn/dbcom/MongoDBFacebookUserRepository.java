package com.fii.taip.msn.dbcom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.fii.taip.msn.dbmodel.FacebookUser;

@Repository
public class MongoDBFacebookUserRepository implements UserRepository {
	@Autowired
	private MongoTemplate template;

	public void insertUser(FacebookUser user) {
		template.insert(user);
	}

}
