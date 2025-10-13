package com.example;

public class Main {
    public static void main(String[] args) {

//        ** BANK CLASS **

//            ValidateInput validator = new ValidateInput();
//            BankAccount acc;
//
//            String owner = validator.getOwnerName();
//            double deposit = validator.getInitialDeposit();
//
//            try {
//                acc = new BankAccount(owner, deposit);
//            } catch (Exception e) {
//                throw new RuntimeException(e);
//            }
//        System.out.println(acc.getBalance());

//        ** EMPLOYEE CLASS **

        Analyst analyst = new Analyst();
        Analyst senior = new Analyst(3000,"Jeff", 23, 5000, Location.Mombasa);

        System.out.println(analyst.location);

    }
}