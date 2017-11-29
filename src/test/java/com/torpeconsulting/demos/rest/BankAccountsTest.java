package com.torpeconsulting.demos.rest;

import org.junit.Test;

import com.torpeconsulting.demos.rest.service.BankAccountsService;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

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
    
    @Test
    public void shouldReachBankAccounts() {
        given()
            .when()
            .get("/bankaccounts/list/user1")
            .then()
            .statusCode(200);            
    }

    @Test
    public void shouldListBankAccounts() {
        given().get("/bankaccounts/list/user1").prettyPrint();
        given()
            .when()
            .get("/bankaccounts/list/user1")
            .then()
            .statusCode(200)
            .body("$.size", equalTo(2));
    }
}