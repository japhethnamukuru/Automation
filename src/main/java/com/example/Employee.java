package com.example;

enum Location {
    Nairobi,
    Kisumu,
    Mombasa, Nakuru
}

public class Employee extends Person {
//    Creating the class attributes
    protected double salary;
    Location location;

//    Creating the default constructor

    public Employee () {
        super("Employee_name", 20);
        this.salary = 40000;
        this.location = Location.Nairobi;
    }


    public Employee(String name, int age, double salary, Location location) {
        super(name, age);
        this.salary = salary;
        this.location = location;
    }

//    Creating the behaviour

    void talk () {
        System.out.println("How're you?");
    }

    double raiseSalary(double percentage) {
        return  this.salary + (this.salary * percentage);
    }
}
