package org.example;

import java.util.Scanner;

public class NumberToText {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        //Pide al usuario un numero del 0 al 20 e imprimir su valor en texto.
    String[] numbers = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen"
            ,"Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen","Twenty", "twenty-one"
            ,"Twenty-two","Twenty-three","Twenty-four","Twenty-five","Twenty-six","Twenty-seven","Twenty-eight","Twenty-nine","Thirty","Thirty-one","Thirty-two",
            "Thirty-three","Thirty-four","Thirty-five","Thirty-six","Thirty-seven","Thirty-eight","Thirty-nine","Forty", "Forty-one", "Forty-two",
            "Forty-three","Forty-four","Forty-five","Forty-six","Forty-seven", "Forty-eight","Forty-nine","Fifty","Fifty-one","Fifty-two","Fifty-three",
            "Fifty-four","Fifty-five","Fifty-six","Fifty-seven","Fifty-eight","Fifty-nine","Sixty","Sixty-one","Sixty-two","Sixty-three","Sixty-four",
            "Sixty-five","Sixty-six","Sixty-seven","Sixty-eight","Sixty-nine","Seventy","Seventy-one","Seventy-two","Seventy-three","Seventy-four",
            "Seventy-five","Seventy-six","Seventy-seven","Seventy-eight","Seventy-nine","Eighty","Eighty-one","Eighty-two","Eighty-three","Eighty-four",
            "Eighty-five","Eighty-six","Eighty-seven","Eighty-eight","Eighty-nine","Ninety","Ninety-one","Ninety-two","Ninety-three","Ninety-four",
            "Ninety-five","Ninety-six","Ninety-seven","Ninety-eight","Ninety-nine","One hundred",};

        System.out.println("Please enter a number\n-->");
        int number = scanner.nextInt();
        System.out.println(numbers[number]);

    }
}

