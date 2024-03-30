package org.example;

import java.util.Scanner;

public class NumberToText {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        //Pide al usuario un numero del 0 al 20 e imprimir su valor en texto.
    String[] numbers = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen"
            ,"Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen","Twenty",};

        System.out.println("Please enter a number\n-->");
        int number = scanner.nextInt();
        System.out.println(numbers[number]);

    }
}
