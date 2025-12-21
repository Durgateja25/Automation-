package com.bank_account;

public class Savings_Account extends Account {

    public Savings_Account(double balance, double interestRate) {
        super(balance, interestRate);
    }

    @Override
    public void calculateInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Savings Account Balance after Interest: " + balance);
    }
}
