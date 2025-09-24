package com.example;

public class MenuItem {
    private String name;
    private double price;

    private static final String[] VALID_NAMES = {"latte", "cappuccino", "espresso", "americano", "mocha"};

    private static final double MAX_PRICE = 100.0;

    public MenuItem(String name, double price) {
        setName(name);
        setPrice(price);
    }

    public void setName(String name) {
        String lowercaseName = name.toLowerCase();
        for (String validName : VALID_NAMES) {
            if (validName.equals(lowercaseName)) {
                this.name = name;
                return;
            }
        }
        throw new IllegalArgumentException("Invalid drink name. Must be one of: " + String.join(", ", VALID_NAMES));
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        if (price > MAX_PRICE) {
            throw new IllegalArgumentException("Price cannot exceed $" + MAX_PRICE);
        }
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
}
