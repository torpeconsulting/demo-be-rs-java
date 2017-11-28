package com.torpeconsulting.demos.rest;

import org.junit.BeforeClass;
import org.junit.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;

public class RestTest {
    
    @BeforeClass
    public static void setup() {
        RestAssured.port = Integer.valueOf(8080);
        RestAssured.basePath = "/demo/rest/v1/";
        RestAssured.baseURI = "http://localhost";
    }
}