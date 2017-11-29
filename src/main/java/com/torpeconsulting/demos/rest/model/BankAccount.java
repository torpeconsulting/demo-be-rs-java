package com.torpeconsulting.demos.rest.model;

/**
 * @author Pedro Torrao <pedro.torrao@torpeconsulting.com>
 */
public class BankAccount {
    private String iban;
    private Amount balance;
    
    public BankAccount(String iban, Amount balance) {
        this.iban = iban;
        this.balance = balance;
    }

    public String getIban() {
        return iban;
    }

    public Amount getBalance() {
        return balance;
    }
}