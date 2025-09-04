package com.example;

import java.util.Scanner;

public class FizzBuzz {
    public static String printFizzBuzz(int input) {
        String output;

        if ((input % 15) == 0) {
            output = "FizzBuzz";
        } else if ((input % 5) == 0) {
            output = "Buzz";
        } else if ((input % 3) == 0) {
            output = "Fizz";
        } else {
            output = Integer.toString(input);
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        using while loop
        while (true) {
            System.out.print("Enter a number: ");
            int value = input.nextInt();

            if (value == 0) {
                System.out.println("Printer Stopped! Bye :)");
                break;
            } else {
                System.out.println(printFizzBuzz(value));
            }
        }

//        Using for loop
        System.out.println("Print fizzbuzz over a range");
        System.out.print("Enter the range value: ");
        int range_value = input.nextInt();

        for (int i = 1; i<= range_value; i++) {
            System.out.print(printFizzBuzz(i) + "\t");
        }
    }
}
