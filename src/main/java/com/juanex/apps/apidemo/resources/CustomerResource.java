package com.juanex.apps.apidemo.resources;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;

@Path("/api/customers")
public class CustomerResource {
    @GET
    public Response hello(){
        return Response.ok("Hello World").build();
    }
}
