package com.example;

public class Main {
    public static void main(String[] args) {
        Employee emp_1 = new Employee("Agnes", 30, 140000, Location.Nairob);
        Employee emp_2 = new Employee("Sharley", 30, 140000, Location.Kisumu);



        BankAcount acc1 = new BankAcount("Jeff", 500);

        acc1.setOwner("Martin");
        acc1.depositAmount(35000);
//        System.out.println(acc1.getOwner());
        System.out.println(acc1.getBalance());

//        System.out.println(acc1.withdrawAmount(300));
    }
}