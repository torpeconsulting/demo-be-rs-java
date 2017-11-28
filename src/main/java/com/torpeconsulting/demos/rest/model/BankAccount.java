package com.torpeconsulting.demos.rest.model;

/**
 * @author Pedro Torrao <pedro.torrao@torpeconsulting.com>
 */
public class BankAccount {
    private String IBAN;
    private Amount balance;
    
    public BankAccount(String IBAN, Amount balance) {
        this.IBAN = IBAN;
        this.balance = balance;
    }

    public String getIBAN() {
        return IBAN;
    }

    public Amount getBalance() {
        return balance;
    }
}