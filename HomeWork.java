package org.example;

import java.lang.reflect.Array;
import java.util.Random;

public class HomeWork {
    public static void main(String[] args) {

//Calculadora de salario: Pregunta al usuario el número de horas trabajadas en una semana y su salario por hora. Calcula el salario semanal, teniendo en cuenta que las horas extras se pagan al doble del salario normal si exceden las 40 horas.

        int hoursWorked = 50;
        double hourlyWage = 100;
        int extraHours = 3;
        double weeklySalary;
        if (hoursWorked > 40) {
            double paidOvertime = extraHours * hourlyWage * 2;
            weeklySalary = (40 * hourlyWage) + paidOvertime;
        } else {
            weeklySalary = hoursWorked * hourlyWage;
        }
        System.out.println("The weekly salary is " + weeklySalary);


//Determinar el mayor de tres números: Solicita al usuario tres números y determina cuál es el mayor de los tres.

        int num1 = 2;
        int num2 = 1;
        int num3 = 1;

        int biggerNumber = num1;
        if (num2 > num1) {
            biggerNumber = num2;
        }
        if (num3 > biggerNumber) {
            biggerNumber = num3;
        }

        System.out.println("The largest number is " + biggerNumber);


//Calculadora de área y perímetro de un círculo: Pide al usuario el radio de un círculo y calcula tanto el área como el perímetro utilizando las fórmulas:
// Área = π * radio^2 y Perímetro = 2 * π * radio.

        double radio = 4;
        double area = Math.PI * Math.pow(radio, 2);
        ;
        double perimeter = 2 * Math.PI * radio;

        System.out.println("The area of the circle is: " + area);
        System.out.println("The perimeter of the circle is: " + perimeter);


//Conversor de moneda: Pregunta al usuario una cantidad en una divisa y el tipo de cambio actual a otra divisa. Convierte la cantidad a la otra divisa.

        double amount = 20;
        double exchangeRate = 36.50;
        double amountConverted = amount * exchangeRate;

        System.out.println("The converted amount is: " + amountConverted);


//Ordenar tres números: Solicita al usuario tres números y muéstralos ordenados de menor a mayor.

        int numOne = 7;
        int numTwo = 13;
        int numThree = 15;


//Verificar si un año es un siglo: Pregunta al usuario un año y determina si es un año de un siglo (divisible por 100) y si es un año bisiesto.

        int year = 2024;
        if (year % 100 == 0) {
            System.out.println(year + " It's a year of a century");
        } else {
            System.out.println(year + " It's not a year of a century");
        }
        ;

        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " It's a leap year");
        } else {
            System.out.println(year + " Its not a leap year");
        }


//Juego de adivinar un número: Genera aleatoriamente un número entre 1 y 100 y pide al usuario que adivine el número. Proporciona pistas indicando si el número ingresado es mayor o menor que el número generado. (este no lo hagas aun, lo haras despues de la siguiente clase)


        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        int Attempts = 0;
        boolean guessed = false;

        System.out.println("Bienvenido al juego de adivinar el número entre 1 y 100 ");


    }
}
