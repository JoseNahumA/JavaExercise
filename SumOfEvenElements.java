package org.example;

import java.util.Scanner;

public class SumOfEvenElements {
    public static void main(String[] args) {
       /* 1. Suma de elementos pares:
        Requerimientos:
        - Crear un programa en Java que sume los elementos pares de un array de números enteros.
        - El programa debe definir un array de números enteros.
        - Utilizar un ciclo for-each para recorrer cada elemento del array.
        - Dentro del ciclo, verificar si cada elemento es par utilizando operadores aritméticos.
        - Sumar únicamente los elementos pares.
        - Mostrar la suma de los elementos pares al final.*/

        int [] integerNumbers = {1,2,3,4,5,6,7,8,9,10};
        int sumPairs = 0;
        for (int number : integerNumbers){
        if (number % 2 == 0) {
            sumPairs += number;
        }
            System.out.println("The sum of even numbers is even " + sumPairs);
        }
    }
}
