package com.example;

public class BankAccount {
    private String owner;
    private double balance;
    private final double minBalance = 500;

    public BankAccount(String owner, double balance) {
        this. owner = owner;
        this.balance = balance;
    }

//    public void setOwner(String owner) {
//        this.owner = owner;
//    }

    public String getOwner() {
        return this.owner;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

//    methods
    public void depositAmount(double depositAmount) {
        if (depositAmount <= 0) {
            System.out.println("Amount must be greater than 0");
        } else {
            this.balance += depositAmount;
        }

    }

    public void withdrawAmount(double withdrawAmount) {
        if (withdrawAmount <= 0) {
            System.out.println("Amount must be greater than 0");
        } else {
            double projectedBalance = this.balance - withdrawAmount;
            if (projectedBalance < minBalance) {
                System.out.println("Insufficient funds");
            } else {
                this.balance -= withdrawAmount;
            }
        }

    }
}
