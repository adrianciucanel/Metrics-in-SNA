package com.fii.taip.msn.infrastructure;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.fii.taip.msn.dbmodel.FacebookUser;
import com.fii.taip.msn.dto.EdgeDTO;
import com.fii.taip.msn.dto.GraphDTO;
import com.fii.taip.msn.dto.NodeDTO;

public class GraphGeneratorTest {

	private GraphGenerator graphGenerator;
	
	private UserRep userRepository;
	
	private ConversationRep conversationRepository;
	
	@Before
	public void setUp() {
		conversationRepository = new ConversationRep();
		userRepository = new UserRep();
		graphGenerator = new GraphGenerator();
		graphGenerator.setConversationRepository(conversationRepository);
		graphGenerator.setUserRepository(userRepository);
		
	}
	
	@Test
	public void shouldGenerateEdges() {
		userRepository.setNumberOfUsers(4);
		conversationRepository.setNumberOfConversations(4);
		GraphDTO generatedGraph = graphGenerator.generateGraph();
		List<EdgeDTO> generatedEdges = generatedGraph.getEdges();
		List<NodeDTO> generatedNodes = generatedGraph.getNodes();
		NodeDTO nodeToBeGenerated = new NodeDTO();
		nodeToBeGenerated.setId("user1");
		assertTrue("Expected to contain node.", generatedNodes.contains(nodeToBeGenerated));
		FacebookUser user1 = new FacebookUser();
		FacebookUser user2 = new FacebookUser();
		user1.setId("user1");
		user2.setId("user2");
		assertTrue("Expected to contain edges.", generatedEdges.contains(new EdgeDTO("", user1, user2)));
	}
	
	@Test
	public void shouldGenerateQuickly() {
		userRepository.setNumberOfUsers(2000);
		conversationRepository.setNumberOfConversations(2000);
		graphGenerator.generateGraph();
	}
}
