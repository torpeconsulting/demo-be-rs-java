package com.torpeconsulting.demos.rest;

import java.lang.reflect.Type;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import com.torpeconsulting.demos.rest.model.BankAccount;

/**
 * @author Pedro Torrao <pedro.torrao@torpeconsulting.com>
 */

@Path("/v1")
public class RestServer {
    @Inject
    EchoService echoService;
    @Inject
    BankAccountsService bankAccountsService;

    @GET
    @Path("/ping")
    @Produces({ "text/plain" })
    public String ping() {
        return "It's alive!";
    }

    @GET
    @Path("/echo/{token}")
    @Produces({ "application/json" })
    public String echo(@PathParam("token") String token) {
        return "{\"result\":\"" + echoService.echo(token) + "\"}";
    }

    @GET
    @Path("/bankaccounts/{owner}")
    @Produces({ "application/json" })
    public List<BankAccount> getAllBankAccounts(@PathParam("owner") String owner) {
        List<BankAccount> bankaccounts = bankAccountsService.getAllAccounts("user1");
//        Gson gson = new Gson();
//        Type type = new TypeToken<List<BankAccount>>() {}.getType();        
//        String json = gson.toJson(bankaccounts, type);

//        return json;
        return bankaccounts;
    }
}
