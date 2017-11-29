package com.torpeconsulting.demos.rest;

import org.junit.Test;
import static io.restassured.RestAssured.given;

public class UserPreferencesTest extends RestTest {
        
    @Test
    public void shouldReachUserPreferencesResource() {
        given()
            .when()
            .get("/prefs/ping")
            .then()
            .statusCode(200);            
    }
}