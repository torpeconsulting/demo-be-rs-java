package com.torpeconsulting.demos.rest.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import javax.inject.Singleton;

import java.math.BigDecimal;

import com.torpeconsulting.demos.rest.model.Amount;
import com.torpeconsulting.demos.rest.model.BankAccount;

/**
 * @author Pedro Torrao <pedro.torrao@torpeconsulting.com>
 */

 @Singleton
public class BankAccountsService {
    static HashMap<String, HashMap<String, BankAccount>> accounts = new HashMap<>();
    static HashMap<String, BankAccount> user1BankAccounts = new HashMap<>();
    static HashMap<String, BankAccount> user2BankAccounts = new HashMap<>();    
        
    static {
        user1BankAccounts.put("IBAN123123123123123", new BankAccount("IBAN123123123123123", new Amount(new BigDecimal(123.456), "EUR")));
        user1BankAccounts.put("IBAN234234234234234", new BankAccount("IBAN234234234234234", new Amount(new BigDecimal(234.567), "ZAR")));
        user2BankAccounts.put("IBAN111111111111111", new BankAccount("IBAN111111111111111", new Amount(new BigDecimal(111.111), "EUR")));
        user2BankAccounts.put("IBAN222222222222222", new BankAccount("IBAN222222222222222", new Amount(new BigDecimal(222.222), "USD")));
        
        accounts.put("user1", user1BankAccounts);
        accounts.put("user2", user2BankAccounts);
    }

    public List<BankAccount> getAllAccounts(String owner) {
        return accounts.get(owner).values().stream().collect(Collectors.toList());
    }

    public BankAccount getAccount(String owner, String iban) {
        return accounts.get(owner).get(iban);
    }
}