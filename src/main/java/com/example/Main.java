package com.example;

public class Main {
    public static void main(String[] args) {
        Employee emp_1 = new Employee("Agnes", 30, 140000, Location.Nairob);
        Employee emp_2 = new Employee("Sharley", 30, 140000, Location.Kisumu);

////        emp_2.raiseSalary(0.1);
//        System.out.println(emp_1.salary);
//        System.out.println(emp_2.salary);
//        System.out.println(emp_2.raiseSalary(0.1));

        BankAcount acc1 = new BankAcount("Jeff", 500);

        acc1.setOwner("Martin");
        double currentBalance = acc1.depositAmount(35000);
//        System.out.println(acc1.getOwner());
        System.out.println(currentBalance);

//        System.out.println(acc1.withdrawAmount(300));
    }
}