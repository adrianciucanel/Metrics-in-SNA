package com.fii.taip.msn.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.fii.taip.msn.infrastructure.GraphGenerator;

@Path("/graph")
public class GraphFacebookAPI {

	@Autowired
	private GraphGenerator graphGenerator;
	
	@GET
	@Consumes({"application/json"})
	@Produces({"application/json"})
	@Path("/")
	public Response getFacebookUsersGraph() {
		return Response.ok().entity(graphGenerator.generateGraph()).build();
	}
}
