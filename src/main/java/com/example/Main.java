package com.example;

public class Main {
    public static void main(String[] args) {

            ValidateInput validator = new ValidateInput();
            BankAccount acc;

            String owner = validator.getOwnerName();
            double deposit = validator.getInitialDeposit();

            try {
                acc = new BankAccount(owner, deposit);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        System.out.println(acc.getBalance());

    }
}