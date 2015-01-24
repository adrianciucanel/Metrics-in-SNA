package com.fii.taip.msn.dto;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

import com.fii.taip.msn.dbmodel.FacebookUser;

public class EdgeDTOTest {
	
	private FacebookUser firstUser;
	
	private FacebookUser secondUser;
	
	private FacebookUser thirdUser;
	
	private FacebookUser fourthUser;
	
	private EdgeDTO edge;
	
	private EdgeDTO otherEdge;
	
	@Before
	public void setUp() {
		firstUser = buildUser("id1", "firstName1", "male", "em@ail.com", 22);
		secondUser = buildUser("id2", "firstName2", "female", "em@ail1.com", 23);
		thirdUser = buildUser("id3", "firstName3", "male", "em@ail.com", 22);
		fourthUser = buildUser("id4", "firstName3", "male", "em@ail.com", 22);
		edge = new EdgeDTO("someID", firstUser, secondUser);
		otherEdge = new EdgeDTO("someID", thirdUser, firstUser);
	}
	
	@Test
	public void shouldBeEqualWithSelf() {
		assertTrue("Expected to be equal with self.", edge.equals(edge));
	}
	
	@Test
	public void shouldNotBeEqualWithNull() {
		assertFalse("Expected to not be equal with null", edge.equals(null));
	}
	
	@Test
	public void shouldNotBeEqualWithObjectOfOtherType() {
		assertFalse("Expected to not be equal with object of other type.", 
				edge.equals(firstUser));
	}
	
	@Test
	public void shouldNotBeEqualIfThereAreDifferentTargetThatAreNotFoundInSource() {
		assertFalse("Expected to not be equal if there are diffrent "
				+ "target that can not be found in sorce.", edge.equals(otherEdge));
	}
	
	@Test
	public void shouldNotBeEqualIfThereAreDifferentSourceThatAreNotFoundInTarget() {
		otherEdge = new EdgeDTO("someID", firstUser, thirdUser);
		assertFalse("Expected to not be equal if there are diffrent "
				+ "source that can not be found in target.", edge.equals(otherEdge));
	}
	
	@Test
	public void shouldNotBeEqualIfThereAreDifferentTargetAndDifferentSource() {
		otherEdge = new EdgeDTO("someID", fourthUser, thirdUser);
		assertFalse("Expected to not be equal if there are diffrent "
				+ "source and target.", edge.equals(otherEdge));
	}
	
	@Test
	public void shouldBeEqualIfThereAreSameSourceAndTarget() {
		otherEdge = new EdgeDTO("someID", firstUser, secondUser);
		assertTrue("Expected to be equal if the there are the same"
				+ " source and same target.", edge.equals(otherEdge));
	}
	
	@Test
	public void shouldBeEqualIfTheTargetIsSwitcedWithSource() {
		otherEdge = new EdgeDTO("someID", secondUser, firstUser);
		assertTrue("Expected to be equal if the the target is switched with source",
				edge.equals(otherEdge));
	}
	
	private FacebookUser buildUser(String userID, String name,
			String gender, String email, Integer age) {
		FacebookUser user = new FacebookUser();
		user.setId(userID);
		user.setName(name);
		user.setGender(gender);
		user.setAge(age);
		return user;
	}
}
