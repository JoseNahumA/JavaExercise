package org.example;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Por favor ingrese un dia\n-->");
        String dayName = scanner.nextLine();
        switch (dayName) {
            case "Lunes":
                System.out.println("1");
                break;
            case "Martes":
                System.out.println("2");
                break;
            case "Miercoles":
                System.out.println("3");
                break;
            case "Jueves":
                System.out.println("4");
                break;
            case "Viernes":
                System.out.println("5");
                break;
            case "Sabado":
                System.out.println("6");
                break;
            case "Domingo":
                System.out.println("7");
                break;
        }





    }
}
