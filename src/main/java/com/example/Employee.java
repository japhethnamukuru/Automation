package com.example;

enum Location {
    Nairob,
    Kisumu,
    Mombasa, Nakuru
}

public class Employee {
//    Creating the class attributes
    String name;
    int age;
    double salary;
    Location location;

//    Creating the constructor
    Employee(String name, int age, double salary, Location location) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.location = location;
    }

//    Creating the behaviour
    double raiseSalary(double percentage) {
        return  this.salary + (this.salary * percentage);
    }
}
