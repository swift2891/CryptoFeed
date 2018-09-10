package com.vignesh.handler;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

@Path("/exchangerate/{currency}/{country}")
public class ExchangeHandler {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String processJSON(@PathParam("currency") String currency,@PathParam("country") String country) {
		String response=null;
		response = processExchgRequest(currency,country);
		return response;
	}
	
	private String processExchgRequest(String currency, String country) {
		
		Client client = ClientBuilder.newClient();
		if(country!=null && !country.equals("all"))
			country = "/"+country;
		else
			country="";
		
		String url = "https://rest.coinapi.io/v1/exchangerate/"+currency+country+"?apikey=556745C6-C855-4AE9-B6AD-B438E385CCF7";

		WebTarget target = client.target(url); 
		
		return target.request(MediaType.APPLICATION_JSON_TYPE).get(String.class);

	}
}

