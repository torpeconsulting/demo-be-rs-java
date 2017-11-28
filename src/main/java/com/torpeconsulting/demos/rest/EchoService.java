package com.torpeconsulting.demos.rest;

/**
 * @author Pedro Torrao <pedro.torrao@torpe.eu>
 */
public class EchoService {

    String echo(String token) {
        return "echo " + token;
    }
}
