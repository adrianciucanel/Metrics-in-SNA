package com.fii.taip.msn.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.http.HttpStatus;

@Path("token")
public class UserFacebookTokenApi {

	@GET
	@Produces({"application/json"})
	@Path("/")
	public Response status() {
		return Response.status(202).build();
	}
}
