package com.fii.taip.msn.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.fii.taip.msn.dto.FacebookUserTokenDto;
import com.fii.taip.msn.infrastructure.DataCollector;

@Path("token")
public class UserFacebookTokenApi {
	
	@Autowired
	private DataCollector collectorService;

	@POST
	@Consumes({"application/json"})
	@Produces({"application/json"})
	@Path("/")
	public Response status(FacebookUserTokenDto token) {
		collectorService.collectData(token);
		return Response.status(201).entity(token).build();
	}
	
}