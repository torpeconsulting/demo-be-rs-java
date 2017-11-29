package com.torpeconsulting.demos.rest.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.inject.Singleton;

import java.math.BigDecimal;

import com.torpeconsulting.demos.rest.model.Amount;
import com.torpeconsulting.demos.rest.model.BankAccount;

/**
 * @author Pedro Torrao <pedro.torrao@torpeconsulting.com>
 */

 @Singleton
public class BankAccountsService {
    static HashMap<String, List<BankAccount>> accounts = new HashMap<>();
    static List<BankAccount> user1BankAccounts = new ArrayList<>();
    static List<BankAccount> user2BankAccounts = new ArrayList<>();    
        
    static {
        user1BankAccounts.add(new BankAccount("IBAN123123123123123", new Amount(new BigDecimal(123.456), "EUR")));
        user1BankAccounts.add(new BankAccount("IBAN234234234234234", new Amount(new BigDecimal(234.567), "ZAR")));
        user2BankAccounts.add(new BankAccount("IBAN111111111111111", new Amount(new BigDecimal(111.111), "EUR")));
        user2BankAccounts.add(new BankAccount("IBAN222222222222222", new Amount(new BigDecimal(222.222), "USD")));
        
        accounts.put("user1", user1BankAccounts);
        accounts.put("user2", user2BankAccounts);
    }

    public List<BankAccount> getAllAccounts(String owner) {
        return accounts.get(owner);
    }
}