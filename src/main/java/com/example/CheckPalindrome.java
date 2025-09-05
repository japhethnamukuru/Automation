package com.example;

import java.util.Scanner;

public class CheckPalindrome {

    public static String checkPalindrome(String inputText) {
        // Remove spaces and make lowercase
        String cleaned = inputText.replaceAll("\\s+", "").toLowerCase();

        // Reverse the string
        String reversed = new StringBuilder(cleaned).reverse().toString();

        if (cleaned.equals(reversed)) {
            return "Palindrome";
        } else {
            return "Not a palindrome";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter text to check (type 'exit' to quit):");
        while (true) {
            System.out.print("> ");
            String inputText = input.nextLine();

            if (inputText.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.println(checkPalindrome(inputText));
        }

        System.out.println("Program terminated. Bye!");
    }
}
