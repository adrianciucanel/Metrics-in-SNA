package com.fii.taip.msn.dbcom;

import java.util.List;

import com.fii.taip.msn.dbmodel.Conversation;
import com.fii.taip.msn.dbmodel.User;
import com.fii.taip.msn.dto.FacebookConversationDto;

public class MySQLConversation implements ConversationRepository {

	public Conversation create(User owner, FacebookConversationDto dto) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Conversation> createList(User owner,
			List<FacebookConversationDto> dto) {
		// TODO Auto-generated method stub
		return null;
	}

	public Conversation get(User owner, long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Conversation> getList(User owner) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Conversation> getList(User owner, User participant) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Conversation> getList(List<User> participants) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Conversation> getList(User owner, List<User> participants) {
		// TODO Auto-generated method stub
		return null;
	}

}
