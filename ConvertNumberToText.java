package org.example;

import java.util.Scanner;

public class ConvertNumberToText {
    public static void main(String[] args) {
        /*
         * request to the user a number between 0 and 10
         * then, store the number in a variable called `numberToConvert`
         * and apply any logic to convert the number from e.g. `5` to `Five`
         * */

        // Your code here....


        Scanner pepe = new Scanner(System.in);

        System.out.println("Hello please give me a number between 0 and 10 ");
        int numberToCovert = pepe.nextInt();

        if (numberToCovert == 10) {
            System.out.println("The number entered is" + " Ten");
        } else if (numberToCovert == 9) {
            System.out.println("The number entered is" + " Nine");
        }else if (numberToCovert == 8) {
            System.out.println("The number entered is" + " Eight");
        }else if (numberToCovert == 7) {
        System.out.println("The number entered is" + " Seven");
        }else if (numberToCovert == 6) {
            System.out.println("The number entered is" + " Six");
        }else if (numberToCovert == 5) {
            System.out.println("The number entered is" + " Five");
        }else if (numberToCovert == 4) {
            System.out.println("The number entered is" + " Four");
        }else if (numberToCovert == 3) {
            System.out.println("The number entered is" + " Three");
        }else if (numberToCovert == 2) {
            System.out.println("The number entered is" + " Two");
        }else if (numberToCovert == 1) {
            System.out.println("The number entered is" + " One");
        }else if (numberToCovert == 0) {
            System.out.println("The number entered is" + " Zero");
        }else {
            System.out.println("The number entered is not among the requested values ");
        }
    }
}
