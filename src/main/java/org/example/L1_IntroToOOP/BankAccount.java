package org.example.L1_IntroToOOP;

import java.util.ArrayList;

public class BankAccount {
    private double balance;
    private String name;
    private ArrayList<String> transactionLog;

    public BankAccount() {
        name = "";
        balance = 0.0;
        transactionLog = new ArrayList<>();
    }

    public BankAccount(double balance, String name) {
        this.balance = balance;
        this.name = name;
        transactionLog = new ArrayList<>();
    }

    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Amount can't be negative");
            return;
        }
        balance += amount;
        transactionLog.add("Deposited $" + amount);
        System.out.println("Deposited " + amount);
    }

    public void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Amount can't be negative");
            return;
        }

        if (amount > balance) {
            System.out.println("Amount can't be greater than balance");
            return;
        }

        balance -= amount;
        transactionLog.add("Withdrawn $" + amount);
        System.out.println("Withdrawn " + amount);
    }

    public void showTransaction() {
        for (String transaction : transactionLog) {
            System.out.println(transaction);
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
