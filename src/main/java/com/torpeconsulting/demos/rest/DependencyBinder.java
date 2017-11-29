package com.torpeconsulting.demos.rest;

import org.glassfish.hk2.utilities.binding.AbstractBinder;

import com.torpeconsulting.demos.rest.service.BankAccountsService;

public class DependencyBinder extends AbstractBinder {

    @Override
    protected void configure() {
       bind(BankAccountsService.class).to(BankAccountsService.class);
    }
}