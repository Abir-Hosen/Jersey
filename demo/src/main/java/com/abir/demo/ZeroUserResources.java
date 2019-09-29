package com.abir.demo;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("user")
public class ZeroUserResources {
	
	
	ZeroUserRepository repo=new ZeroUserRepository();
	
	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public List<ZeroUser> getUser(){
		return repo.getUser();
	}
	
	@GET
	@Path("/{id}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public ZeroUser getUserById(@PathParam("id") int id){
		return repo.getUser(id);
	}
	
	@POST
	@Path("post")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public ZeroUser create(ZeroUser u1) {
		repo.create(u1);
		System.out.println(u1);
		return u1;
	}
	
	
}
