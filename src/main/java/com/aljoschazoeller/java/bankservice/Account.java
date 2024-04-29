package com.aljoschazoeller.java.bankservice;

import java.math.BigDecimal;

public class Account {
    String accountNumber;
    BigDecimal accountBalance;
    Client customer;

    public void depositMoney(BigDecimal moneyToDeposit) {
        accountBalance = accountBalance.add(moneyToDeposit);
    }

    public void withdrawMoney(BigDecimal moneyToWithdraw) {
        accountBalance = accountBalance.subtract(moneyToWithdraw);
    }
}
