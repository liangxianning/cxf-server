package com.lessony.java.service;

import java.io.IOException;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.lessony.java.vo.User;
import com.lessony.java.vo.Users;

@Path("/user")
public interface IUserService {
    
    @GET
    @Path("/{id}")
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public User getUser(@PathParam("id") int id);
    
    @GET
    @Path("/array")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Users getArray();
    
    @GET
    @Path("/list")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Users getList();
    
    @GET
    @Path("/map")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Users getMap();
    
    @POST
    @Path("/add")
    public User postData(User user) throws IOException;
    
    @PUT
    @Path("/update/{id}")
    @Consumes(MediaType.APPLICATION_XML)
    public User putData(@PathParam("id") int id, User user);
    
    @DELETE
    @Path("/delete/{id}")
    public void deleteData(@PathParam("id") int id);
}
