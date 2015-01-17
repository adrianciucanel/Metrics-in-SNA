package com.fii.taip.msn.infrastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fii.taip.msn.dbcom.FacebookConversationRepository;
import com.fii.taip.msn.dbcom.FacebookUserRepository;
import com.fii.taip.msn.dbmodel.Conversation;
import com.fii.taip.msn.dbmodel.FacebookUser;
import com.fii.taip.msn.dto.EdgeDTO;
import com.fii.taip.msn.dto.GraphDTO;
import com.fii.taip.msn.dto.NodeDTO;

@Service
public class GraphGenerator {
	
	@Autowired
	private FacebookUserRepository userRepository;
	
	@Autowired
	private FacebookConversationRepository conversationRepository;

	public GraphDTO generateGraph() {
		GraphDTO graph = new GraphDTO();
		graph.setNodes(generateNodes());
		graph.setEdges(generateEdges());
		return graph;
	}
	
	private List<NodeDTO> generateNodes() {
		List<FacebookUser> users = userRepository.allUsers();
		return NodeDTO.createNodesFrom(users);
	}
	
//	private List<EdgeDTO> generateEdges() {
//		List<FacebookUser> processedUser = new ArrayList<FacebookUser>();
//		List<FacebookUser> users = userRepository.allUsers();
//		Set<EdgeDTO> edges = new HashSet<EdgeDTO>();
//		for(FacebookUser user : users) {
//			List<Conversation> userConversations= conversationRepository.get(user);
//			for(Conversation userConversation : userConversations) {
//				for(String conUserID : userConversation.getToList()) {
//					FacebookUser friend = FacebookUser.isUserWithIdInList(conUserID, users);
//					if(friend != null && !processedUser.contains(friend)) {
//						EdgeDTO edge = new EdgeDTO(user, friend);
//						if (!edges.add(edge)) {
//							Integer labelValue = Integer.parseInt(edge.getLabel());
//							edge.setLabel(String.valueOf(++labelValue));
//						}
//					}
//				}
//			}
//			processedUser.add(user);
//		}
//		return null;
//	}
	
	private List<EdgeDTO> generateEdges() {
		List<Conversation> conversations = conversationRepository.allConversations();
		List<FacebookUser> users = userRepository.allUsers();
		Map<EdgeDTO, Integer> edges = new HashMap<EdgeDTO, Integer>();
		for(Conversation conversation : conversations) {
			FacebookUser owner = FacebookUser.isUserWithIdInList(conversation.getOwnerId(), users);
			for (String friendID : conversation.getToList()) {
				FacebookUser friend = FacebookUser.isUserWithIdInList(friendID, users);
				if(friend != null) {
					EdgeDTO edge = new EdgeDTO(String.valueOf(UUID.randomUUID()), owner, friend);
					if (edges.containsKey(edge)) {
						Integer numberOfMessages = edges.get(edge);
						numberOfMessages += conversation.getMessages().size();
						edges.put(edge, numberOfMessages);
					}
					else {
						edges.put(edge, conversation.getMessages().size());
					}
				}
			}
		}
		return extractEdges(edges);
	}
	
	private List<EdgeDTO> extractEdges(Map<EdgeDTO, Integer> edges) {
		List<EdgeDTO> edgesList = new ArrayList<EdgeDTO>();
		edgesList.addAll(edges.keySet());
		for(EdgeDTO edge: edgesList) {
			edge.setLabel(String.valueOf(edges.get(edge) / 2));
		}
		return edgesList;
	}
}
