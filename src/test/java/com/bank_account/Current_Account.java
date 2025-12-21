package com.bank_account;

public class Current_Account extends Account {

    public Current_Account(double balance, double interestRate) {
        super(balance, interestRate);
    }

    @Override
    public void calculateInterest() {
        System.out.println("Current Account usually has no interest.");
    }

}
