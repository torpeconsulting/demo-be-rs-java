package com.torpeconsulting.demos.rest;

import org.junit.Test;
import static io.restassured.RestAssured.given;

public class HealthCheckTest extends RestTest {
        
    @Test
    public void shouldReachHealthCheckResource() {
        given()
            .when()
            .get("/healthcheck/ping")
            .then()
            .statusCode(200);            
    }
}