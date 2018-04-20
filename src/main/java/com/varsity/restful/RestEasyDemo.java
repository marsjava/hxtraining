package com.varsity.restful;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
@Path("/publish")
public class RestEasyDemo {
	@GET
	@Path("/message")
	public Response publishMessage(@PathParam("message")String message) {
		String resp = "Received Message: "+message;
		return Response.status(200).entity(resp).build();
	}
}