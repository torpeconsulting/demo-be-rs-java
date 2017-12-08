package com.torpeconsulting.demos.rest;

import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;
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
    @Produces({ "application/json" })
    public Response getAllBankAccounts() {
        List<BankAccount> bankaccounts = bankAccountsService.getAllAccounts("user1");

        GenericEntity<List<BankAccount>> entity = new GenericEntity<List<BankAccount>>(bankaccounts) { };
        return Response.ok(entity).build();
    }

    @GET
    @Path("/{iban}")
    @Produces({ "application/json" })
    public Response getBankAccount(@PathParam("iban") String iban) {
        BankAccount bankaccount = bankAccountsService.getAccount("user1", iban);

        GenericEntity<BankAccount> entity = new GenericEntity<BankAccount>(bankaccount) { };
        return Response.ok(entity).build();
    }

}
