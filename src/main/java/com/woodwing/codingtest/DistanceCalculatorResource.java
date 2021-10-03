package com.woodwing.codingtest;

import org.jboss.logging.Logger;

import javax.ws.rs.*;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static javax.ws.rs.core.MediaType.TEXT_PLAIN;

@Path("/")
public class DistanceCalculatorResource {

    private Logger logger = Logger.getLogger(DistanceCalculatorResource.class);

    public static final String DISTANCE_CALCULATOR_PATH = "distance-calculator/";

    @POST
    @Consumes(APPLICATION_JSON)
    @Produces(TEXT_PLAIN)
    @Path(DISTANCE_CALCULATOR_PATH)
    public String calculate(CalculationRequest request) {
        logger.infof("Calculation Request: [%s]", request);
        return "7.73";
    }
}
