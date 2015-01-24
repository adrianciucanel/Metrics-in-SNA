package com.fii.taip.msn.extapi;

import static org.junit.Assert.assertNotNull;

import org.junit.Ignore;
import org.junit.Test;

import com.restfb.Connection;
import com.restfb.types.Thread;
import com.restfb.types.User;

public class FacebookConnectorTest {
	
	@Ignore
	@Test
	public void expectUserDetails(){
		IConnector connector = new FacebookConnector();
	    User user = connector.GetUserDetails("CAAF1SxWe2EkBAMBhOQJhHHWk1ImHZBd3ZAIPHkRjmUqWE1mIj9VrgZB6hCtWqEaPqPrcgSmb7FOCONScQaFRt1adthFjj59COXIZAxTm1tgEVWtWmYVZAIdKJCE72NT0tql4TOShZCOYYPOwwYZA8o4eEwQXUlNavzgUl3IuX5TGX57uNJhkrTnofk4W6c1cAdwYvKWMtjQ54XM3T3PZC1W5oZAOIVWWHHFEZD");
	    assertNotNull("Expected not null user.", user);
	}
	@Ignore
	@Test
	public void expectUserInbox(){
		IConnector connector = new FacebookConnector();
		Connection<Thread> threads = connector.GetUserInbox("CAAF1SxWe2EkBAPeBRLOS3MGgFfoAUM51vW1ZCwo0V8BUrnll4NxbbGWZAfLUL9Vpov3YFHjEBS8ur9qKRe0Co7cf5ivCBJdAWGLJEPG1NwZALhcAk4zla9CTvMepJ0nmHNunMXZC9gl7GgPEKZAZAu7cYmXZChZAgBqbW6YgDybYSnuJysE7I5CC6EoGz7XEzlZC3KeovzNjpz8vTW712CIbwlPat7B6zr6MZD");
	}
	@Ignore
	@Test
	public void expectUserFriends(){
		IConnector connector = new FacebookConnector();
		Connection<User> friends = connector.GetUserFriends("CAAF1SxWe2EkBAPeBRLOS3MGgFfoAUM51vW1ZCwo0V8BUrnll4NxbbGWZAfLUL9Vpov3YFHjEBS8ur9qKRe0Co7cf5ivCBJdAWGLJEPG1NwZALhcAk4zla9CTvMepJ0nmHNunMXZC9gl7GgPEKZAZAu7cYmXZChZAgBqbW6YgDybYSnuJysE7I5CC6EoGz7XEzlZC3KeovzNjpz8vTW712CIbwlPat7B6zr6MZD");
	}

}
