package com.example;

import java.util.Scanner;

public class Calc {
    public static int addNumbers(int num1, int num2) {
        return  num1 + num2;
    }

    public static  int subtractNumbers(int  num1, int num2) {
        return num1 - num2;
    }

    public static int multiplyNumbers(int num1, int num2) {
        return num1 * num2;
    }

    public static int divideNumbers(int num1, int num2) {
        return num1 / num2;
    }

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        boolean runCalc = true;

        while (runCalc) {
            System.out.print("Enter the first number: ");
            int num1 = input.nextInt();
            if (num1 == 0) {
                System.out.println("Calculator closed, Bye :)");
                break;
            }

            System.out.print("Enter the second number: ");
            int num2 = input.nextInt();
            if (num2 == 0) {
                System.out.println("Calculator closed, Bye :)");
                break;
            }

            System.out.println("Select operation i.e\n 1 = add\n 2 = subtract\n 3 = multiply\n 4 = divide\n 0 = exit");
            int option = input.nextInt();

//            if (option == 1 ){
//                System.out.println("The sum of the two numbers is: "+ (addNumbers(num1, num2)));
//            } else if (option == 2 ) {
//                System.out.println("The difference of the two numbers is: "+ (subtractNumbers(num1, num2)));
//            } else if (option == 3 ) {
//                System.out.println("The product of the two numbers is: "+ (multiplyNumbers(num1, num2)));
//            } else if (option == 4) {
//                System.out.println("The quotient of the two numbers is: "+ (divideNumbers(num1, num2)));
//            } else if (option == 0){
//                System.out.println("Calculator closed, Bye :)");
//                runCalc = false;
//            } else {
//                System.out.println("Invalid option");
//            }
            switch (option) {
                case 1 -> System.out.println("Sum: " + addNumbers(num1, num2));
                case 2 -> System.out.println("Difference: " + subtractNumbers(num1, num2));
                case 3 -> System.out.println("Multiplication:" + multiplyNumbers(num1, num2));
                case 4 -> System.out.println("Division: " + divideNumbers(num1, num2));
                case 0 -> {
                    System.out.println("Calculator closed, Bye :)");
                    runCalc = false;
                }
                default -> System.out.println("Invalid option");
            }

        }

    }
}
