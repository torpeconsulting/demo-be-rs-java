package com.torpeconsulting.demos.rest;

import org.junit.Test;

import static io.restassured.RestAssured.given;

import static org.hamcrest.Matchers.containsString;

public class PingTest extends RestTest {
    @Test
    public void basicPingTest() {
        given().when().get("/ping").then().statusCode(200);
        given().when().get("/ping").then().body(containsString("alive"));
    }

}