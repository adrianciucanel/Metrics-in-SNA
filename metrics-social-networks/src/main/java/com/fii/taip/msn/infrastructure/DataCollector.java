package com.fii.taip.msn.infrastructure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fii.taip.msn.dbcom.ConversationRepository;
import com.fii.taip.msn.dbcom.FacebookTokenRepository;
import com.fii.taip.msn.dbcom.UserRepository;
import com.fii.taip.msn.dbmodel.FacebookUser;
import com.fii.taip.msn.dto.FacebookUserTokenDto;
import com.fii.taip.msn.extapi.IConnector;

@Service
public class DataCollector {
	@Autowired
	private FacebookTokenRepository facebookTokenRepository;
	
	@Autowired
	private UserRepository facebookUserRepository;
	
	@Autowired
	private ConversationRepository conversationRepository;
	
	@Autowired
	private IConnector connector;
	
	public void collectData(final FacebookUserTokenDto token){
		facebookTokenRepository.insert(token);
		FacebookUser user=new FacebookUser(connector.GetUserDetails(token.getToken()));
		facebookUserRepository.insertUser(user);
		conversationRepository.insert(user, connector.GetUserInbox(token.getToken()));
	}
	
}
