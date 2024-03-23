package org.example;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        int dayNumber = 0;
        System.out.println("Por favor ingrese un dia\n-->");
        String dayName = scanner.nextLine();
        switch (dayName.toLowerCase()) {
            case "lunes":
                dayNumber = 1;
                break;
            case "martes":
                dayNumber = 2;
                break;
            case "miercoles":
                dayNumber = 3;
                break;
            case "jueves":
                dayNumber = 4;
                break;
            case "viernes":
                dayNumber = 5;
                break;
            case "sabado":
                dayNumber = 6;
                break;
            case "domingo":
                dayNumber = 7;
                break;
            default:
                System.out.println("Introduce un dia de la semana valido");
        }
        if (dayNumber > 0 && dayNumber < 8){
            System.out.println("El numero del dia es " + dayNumber);
        }




    }
}
