package com.torpeconsulting.demos.rest;

import org.junit.Test;

import static io.restassured.RestAssured.given;

import static org.hamcrest.Matchers.containsString;

public class BankAccountsTest extends RestTest {
    @Test
    public void getAccountsTest() {
        given().when().get("/bankaccounts/user1").then().statusCode(200);
    }

}