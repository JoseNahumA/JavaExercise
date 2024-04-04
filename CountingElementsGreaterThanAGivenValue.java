package org.example;

import java.util.Scanner;

public class CountingElementsGreaterThanAGivenValue {
    public static void main(String[] args) {

       /* 2. Conteo de elementos mayores que un valor dado:
        Requerimientos:
        - Desarrollar un programa en Java que cuente los elementos mayores que un valor dado en un array de números enteros.
        - El programa debe solicitar al usuario que ingrese un valor.
        - Definir un array de números enteros.
        - Utilizar un ciclo for-each para recorrer cada elemento del array.
        - Dentro del ciclo, verificar si cada elemento es mayor que el valor ingresado por el usuario.
        - Contar los elementos que cumplen con esta condición.
        - Mostrar la cantidad de elementos mayores que el valor dado.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value\n-->");
        int value = scanner.nextInt();
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20
                , 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40
                , 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60
                , 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80
                , 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100};
        int counter = 0;

        for (int number:numbers) {
            if (number > value) {
                counter++;
            }
        }
        System.out.println("Number of elements greater than " + value + " : " + counter);
    }
}
