package com.aljoschazoeller.java.bankservice;

import java.math.BigDecimal;

public class Account {
    String accountNumber;
    BigDecimal accountBalance;
    Client customer;

    public Account(Client customer) {
        long leftLimit = 1L;
        long rightLimit = 9999999999L;
        long generatedLong = leftLimit + (long) (Math.random() * (rightLimit - leftLimit));

        this.accountNumber = String.format("%d10", generatedLong);
        this.accountBalance = BigDecimal.ZERO;
        this.customer = customer;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void depositMoney(BigDecimal moneyToDeposit) {
        accountBalance = accountBalance.add(moneyToDeposit);
    }

    public void withdrawMoney(BigDecimal moneyToWithdraw) {
        accountBalance = accountBalance.subtract(moneyToWithdraw);
    }
}
