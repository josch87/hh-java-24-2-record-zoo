package com.aljoschazoeller.java.bankservice;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class BankService {
    Set<Account> accounts = new HashSet<>();

    public Set<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Set<Account> accounts) {
        this.accounts = accounts;
    }

    public String openAccount(Client customer) {
        Account newAccount = new Account(customer);
        accounts.add(newAccount);
        return newAccount.getAccountNumber();
    }

    public int transferMoney(String sourceAccountNumber, String targetAccountNumber, BigDecimal amount) {
        Account sourceAccount = null;
        Account targetAccount = null;

        for (Account account : accounts) {
            if (account.getAccountNumber().equals(sourceAccountNumber)) {
                sourceAccount = account;
            }
        }

        for (Account account : accounts) {
            if (account.getAccountNumber().equals(targetAccountNumber)) {
                targetAccount = account;
            }
        }
        if (sourceAccount != null && targetAccount != null) {
            sourceAccount.withdrawMoney(amount);
            targetAccount.depositMoney(amount);
            return 1;
        }
        return -1;
    }
}
