package com.aljoschazoeller.java.bankservice;

import java.util.HashSet;
import java.util.Set;

public class BankService {
    Set<Account> accounts = new HashSet<>();

    public String openAccount(Client customer) {
        Account newAccount = new Account(customer);
        return newAccount.getAccountNumber();
    }
}
