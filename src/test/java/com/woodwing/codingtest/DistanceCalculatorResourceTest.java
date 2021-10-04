package com.woodwing.codingtest;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static com.woodwing.codingtest.DistanceCalculatorResource.DISTANCE_CALCULATOR_PATH;
import static io.restassured.RestAssured.given;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static javax.ws.rs.core.MediaType.TEXT_PLAIN;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class DistanceCalculatorResourceTest {

    @Test
    void testHelloEndpoint() {
        var distanceA = Map.of(
                "length", 5,
                "unit", "METER");
        var distanceB = Map.of(
                "length", 3,
                "unit", "YARD");

        var request = Map.of(
                "distanceA", distanceA,
                "distanceB", distanceB,
                "returnUnit", "METER");

        given()
          .when()
                .accept(TEXT_PLAIN)
                .contentType(APPLICATION_JSON)
                .body(request)
                .post(DISTANCE_CALCULATOR_PATH)
          .then()
                .contentType(TEXT_PLAIN)
                .statusCode(200)
             .body(is("7.7432"));
    }

}
