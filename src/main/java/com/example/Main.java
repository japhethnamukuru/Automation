package com.example;

public class Main {
    public static void main(String[] args) {
        Employee emp_1 = new Employee("Agnes", 30, 140000, Location.Nairob);
        Employee emp_2 = new Employee("Sharley", 30, 140000, Location.Kisumu);

//        emp_2.raiseSalary(0.1);
        System.out.println(emp_1.salary);
        System.out.println(emp_2.salary);
        System.out.println(emp_2.raiseSalary(0.1));
    }
}