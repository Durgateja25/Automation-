package com.bank_account;

public class Main_Class {
    public static void main(String[] args) {

        Savings_Account sa = new Savings_Account(10000, 5);
        sa.calculateInterest();

        Current_Account ca = new Current_Account(15000, 0);
        ca.calculateInterest();
    }
}
