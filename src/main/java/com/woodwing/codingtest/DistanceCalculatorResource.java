package com.woodwing.codingtest;

import com.woodwing.codingtest.service.DistanceCalculatorService;
import org.jboss.logging.Logger;

import javax.inject.Inject;
import javax.ws.rs.*;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static javax.ws.rs.core.MediaType.TEXT_PLAIN;

@Path("/")
public class DistanceCalculatorResource {

    private final DistanceCalculatorService service;
    private Logger logger = Logger.getLogger(DistanceCalculatorResource.class);

    public static final String DISTANCE_CALCULATOR_PATH = "distance-calculator/";

    @Inject
    public DistanceCalculatorResource(DistanceCalculatorService distanceCalculatorService) {
        this.service = distanceCalculatorService;
    }

    @POST
    @Consumes(APPLICATION_JSON)
    @Produces(TEXT_PLAIN)
    @Path(DISTANCE_CALCULATOR_PATH)
    public String calculate(CalculationRequest request) {
        logger.infof("Calculation Request: [%s]", request);
        return service.calculate(request).getLength().toPlainString();
    }
}
