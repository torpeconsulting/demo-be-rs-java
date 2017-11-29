package com.torpeconsulting.demos.rest;

import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.torpeconsulting.demos.rest.model.BankAccount;
import com.torpeconsulting.demos.rest.service.BankAccountsService;

/**
 * @author Pedro Torrao <pedro.torrao@torpeconsulting.com>
 */

@Path("/bankaccounts")
public class BankAccountsResource {
    @Inject
    BankAccountsService bankAccountsService;

    @GET
    @Path("/ping")
    @Produces({ "text/plain" })
    public String ping() {
        return "It's alive!";
    }

    @GET
    @Path("/list/{owner}")
    @Produces({ "application/json" })
    public List<BankAccount> getAllBankAccounts(@PathParam("owner") String owner) {
        List<BankAccount> bankaccounts = bankAccountsService.getAllAccounts("user1");
        return bankaccounts;
    }

}
