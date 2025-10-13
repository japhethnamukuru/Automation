package com.example;

public class Analyst extends Employee{
    private double bonus;

    public Analyst () {
        super();
    }

    public Analyst (double bonus, String name, int age, double salary, Location location) {
        super(name, age, salary, location);
        this.bonus = bonus;
    }
}
