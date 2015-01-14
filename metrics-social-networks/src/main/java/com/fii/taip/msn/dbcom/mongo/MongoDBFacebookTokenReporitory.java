package com.fii.taip.msn.dbcom.mongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.fii.taip.msn.dbcom.FacebookTokenRepository;
import com.fii.taip.msn.dto.FacebookUserTokenDto;

@Repository
public class MongoDBFacebookTokenReporitory implements FacebookTokenRepository {

	@Autowired
	private MongoTemplate template;
	
	public void insert(final FacebookUserTokenDto token){
		template.insert(token);	
	}
}
