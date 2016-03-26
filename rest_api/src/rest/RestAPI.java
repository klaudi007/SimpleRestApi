package rest;


import javax.jws.WebService;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import utility.MsgKit;
import service.Service;

@Path("/api")
@WebService
public class RestAPI {

//	*******************************************************************
//	*************************   Territory     *************************
//	*******************************************************************
	
	
	@POST
	@Path("/territory/save")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Object saveTerritory(Object requestEntity)throws Exception{
	try{
		return Response.ok(Service.saveTerritory(requestEntity)).build();
	}catch(Exception e){
		throw new WebApplicationException(Response.status(Status.BAD_REQUEST).entity(MsgKit.errorMsgToJson(e.toString())).build());
	}
	}

	@GET
	@Path("/territory/all")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Object getAllTerritory(){
		return Response.ok(Service.getAllTerritory()).build();
	}
	
//	*******************************************************************
//	*************************     PLAN        *************************
//	*******************************************************************
	
	@POST
	@Path("/soilSurvey/plan/savePlan")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Object savePlan(Object requestEntity) throws Exception{
		try{
			return Response.ok(Service.savePlan(requestEntity)).build();
		}catch(Exception e){
			throw new WebApplicationException(Response.status(Status.BAD_REQUEST).entity(MsgKit.errorMsgToJson(e.toString())).build());
		}
		
	}
	
	
	@GET
	@Path("/soilSurvey/plan/all")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Object getAllPlan(){
		return Response.ok(Service.getAllPlan()).build();
	}
	
	@GET
	@Path("/soilSurvey/plan/{id}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Object getAllPlan(@PathParam("id") Long id ){
		return Response.ok(Service.findPlan(id)).build();
	}
	
	
}