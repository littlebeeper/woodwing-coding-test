package com.woodwing.codingtest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static javax.ws.rs.core.MediaType.TEXT_PLAIN;

@Path(DistanceCalculatorResource.DISTANCE_CALCULATOR_PATH)
public class DistanceCalculatorResource {

    public static final String DISTANCE_CALCULATOR_PATH = "/distance-calculator";

    @GET
    @Produces(TEXT_PLAIN)
    @Consumes(APPLICATION_JSON)
    public String calculate() {
        return "Hello RESTEasy";
    }
}
