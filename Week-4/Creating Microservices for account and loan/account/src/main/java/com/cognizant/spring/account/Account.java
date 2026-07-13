package com.cognizant.spring.account;

public class Account {

    private int accountNumber;
    private String customerName;
    private String accountType;
    private double balance;

    public Account(int accountNumber, String customerName, String accountType, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.accountType = accountType;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }
}