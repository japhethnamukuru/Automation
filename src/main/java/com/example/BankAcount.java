package com.example;

public class BankAcount {
    private String owner;
    private double balance;
    private double minBalance = 500;

    public BankAcount(String owner, double balance) {
        this. owner = owner;
        this.balance = balance;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

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
    public double depositAmount(double depositAmount) {
        return this.balance + depositAmount;
    }

    public double withdrawAmount(double withdrawAmount) {
        if (this.balance - withdrawAmount < minBalance) {
            System.out.println("Insufficient funds");
            return 0;
        } else {
            return this.balance - withdrawAmount;
        }
    }
}
