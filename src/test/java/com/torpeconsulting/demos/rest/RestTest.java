package com.torpeconsulting.demos.rest;

import org.junit.Before;
import org.junit.After;

import com.torpeconsulting.demos.rest.HealthCheckResource;
import com.torpeconsulting.demos.rest.BankAccountsResource;

import java.net.URI;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.grizzly.http.server.HttpServer;

public class RestTest {
    
    private static final String BASE_URI = "http://localhost:8080/";
    private HttpServer httpServer;

    @Before
    public void setUp() throws Exception {
        ResourceConfig resourceConfig = new ResourceConfig()
            .register(HealthCheckResource.class)
            .register(BankAccountsResource.class)
            .register(UserPreferencesResource.class)
            .register(new DependencyBinder());
            

        httpServer = GrizzlyHttpServerFactory.createHttpServer(URI.create(BASE_URI), resourceConfig);
        httpServer.start();    
    }
    
    @After
    public void tearDown() {
        if (httpServer != null) {
            httpServer.shutdownNow();
        }
    }
}