package com.example;

import java.util.Scanner;

public class ValidateInput {
    private final Scanner input = new Scanner(System.in);

    public String getOwnerName() {
        while (true) {
            System.out.println("Enter the account owner's name (or type 'exit' to quit): ");
            String name = input.nextLine();

            if (name.equalsIgnoreCase("exit")) {
                System.out.println("Exiting program...");
                System.exit(0);
            }

            if (name.trim().isEmpty()) {
                System.out.println("Name cannot be empty.");
            } else if (!name.matches("[a-zA-Z ]+")) {
                System.out.println("Invalid name. Letters only, please.");
            } else {
                return name;
            }
        }
    }

    public double getInitialDeposit() {
        while (true) {
            System.out.println("Enter the initial deposit amount: ");
            String line = input.nextLine();

            try {
                double deposit = Double.parseDouble(line);
                if (deposit < 500) {
                    System.out.println("Initial deposit must be at least 500.");
                } else {
                    return deposit;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid amount, please try again.");
            }
        }
    }
}
