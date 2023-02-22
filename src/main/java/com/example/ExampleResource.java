package com.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class ExampleResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public GreetingDTO hello() {
        return GreetingDTO.builder().greet("Ciao Solving Team!").build();
    }
}
