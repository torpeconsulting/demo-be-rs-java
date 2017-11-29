package com.torpeconsulting.demos.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * @author Pedro Torrao <pedro.torrao@torpeconsulting.com>
 */

@Path("/prefs")
public class UserPreferencesResource {

    @GET
    @Path("/ping")
    @Produces({ "text/plain" })
    public String ping() {
        return "It's alive!";
    }
}
