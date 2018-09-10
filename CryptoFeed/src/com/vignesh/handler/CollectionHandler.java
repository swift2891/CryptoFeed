package com.vignesh.handler;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

@Path("/total/{var}")
public class CollectionHandler {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String processJSON(@PathParam("var") String var) {
		String response=null;
		response = processCollectionRequest(var);
		return response;
	}
	
	private String processCollectionRequest(String var) {
		
		Client client = ClientBuilder.newClient();
		
		String url = "https://rest.coinapi.io/v1/"+var+"/"+"?apikey=556745C6-C855-4AE9-B6AD-B438E385CCF7";

		WebTarget target = client.target(url); 
		
		return target.request(MediaType.APPLICATION_JSON_TYPE).get(String.class);

	}
}

