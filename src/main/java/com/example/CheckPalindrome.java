package com.example;

import java.util.Arrays;
import java.util.Scanner;

public class CheckPalindrome {
    public static String checkPalindrome (String input_text) {
        String Result;
        String [] check_text = input_text.split("");
        String [] split_text = input_text.split("");

        for (int i = 0; i < split_text.length / 2; i++) {
            String temp = split_text[i];
            split_text[i] = split_text[split_text.length - 1 - i];
            split_text[split_text.length - 1 - i] = temp;
        }

        if (Arrays.equals(check_text, split_text)) {
            Result = "Palindrome";
        } else {
            Result = "Not a palindrome";
        }

        return Result;
    }

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        String exit = "exit";

        while (true) {
            System.out.print("Enter A text: ");
            String input_text = input.nextLine();

            if (input_text.equals(exit)) {
                break;
            }

            System.out.println(checkPalindrome(input_text));
        }

    }
}
