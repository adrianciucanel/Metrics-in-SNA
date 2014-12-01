package com.fii.taip.msn.dbcom;

import java.util.List;

import com.fii.taip.msn.dbmodel.Conversation;
import com.fii.taip.msn.dbmodel.User;
import com.fii.taip.msn.dto.FacebookConversationDto;

public interface ConversationRepository {

	Conversation create(User owner, FacebookConversationDto dto);
	
	List<Conversation> createList(User owner, List<FacebookConversationDto> dto);
	
	Conversation get(User owner, long id);
	
	List<Conversation> getList(User owner);
	
	List<Conversation> getList(User owner, User participant);
	
	List<Conversation> getList(List<User> participants);
	
	List<Conversation> getList(User owner, List<User> participants);
}
