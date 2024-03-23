package org.example;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your age:\n->");
        int age = scanner.nextInt();
        String message = (age >= 18) ? "he is an adult" : "he is not an adult" ;

        System.out.println(message);

    }

}
