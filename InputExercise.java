package org.example;

import java.util.Scanner;

public class InputExercise {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // instance
        System.out.println("Hello! What is your name?");

        String userName = scanner.nextLine();
        System.out.println("Nice to meet u " + userName);


        System.out.println("How old are you?");
        int age = scanner.nextInt();

        if (age > 50) {
            System.out.println("You are an adult");
        } else if (age > 19) {
            System.out.println("U r eighteen");
        } else if (age > 18) {
            System.out.println("U r nineteen");
        } else {
            System.out.println("You are not an adult");
        }

        System.out.println("Bye bye");

    }
}
