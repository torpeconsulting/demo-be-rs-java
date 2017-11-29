package com.torpeconsulting.demos.rest;

import org.junit.Test;

import com.torpeconsulting.demos.rest.service.BankAccountsService;

import static io.restassured.RestAssured.given;

import javax.annotation.Resource;

public class BankAccountsTest extends RestTest {
        
    @Resource
    private BankAccountsService service;
    
    @Test
    public void shouldReachBankAccountsResource() {
        given()
            .when()
            .get("/bankaccounts/ping")
            .then()
            .statusCode(200);            
    }
}