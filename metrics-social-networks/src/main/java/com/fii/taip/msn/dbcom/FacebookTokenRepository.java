package com.fii.taip.msn.dbcom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.fii.taip.msn.dto.FacebookUserTokenDto;

@Repository
public class FacebookTokenRepository {
	@Autowired
	private MongoTemplate template;
	
	public void insert(final FacebookUserTokenDto token){
		template.insert(token);	
	}
	
}
