package com.fii.taip.msn.dbcom;

import java.util.List;

import com.fii.taip.msn.dbmodel.Conversation;
import com.fii.taip.msn.dbmodel.FacebookUser;
import com.restfb.Connection;
import com.restfb.types.Thread;

public interface FacebookConversationRepository {
	
	List<Conversation> insert (FacebookUser owner, Connection<Thread> dtoList);
	
	List<Conversation> allConversations();
	
	List<Conversation> get(FacebookUser owner);
	
	List<Conversation> get(FacebookUser owner, FacebookUser participant);
}
