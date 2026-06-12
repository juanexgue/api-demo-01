package com.juanex.apps.apidemo.resources;

import com.juanex.apps.apidemo.dto.CustomerRequest;
import com.juanex.apps.apidemo.service.CustomerService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;

@Path("/api/customers")
public class CustomerResource {

    @Inject
    CustomerService customerService;

    @GET
    public Response findAll() {

        var customers = customerService.findAll();

        if(customers.isEmpty()) {
            return Response.noContent().build();
        }

        return Response
                .ok(customers)
                .build();
    }

    @POST
    public Response create(CustomerRequest customerRequest) {

        var customerResponse = customerService.create(customerRequest);

        return Response
                .ok(customerResponse)
                .build();
    }
}
