package com.ejercicios15_10_2020;

import java.util.Scanner;

public class ejercicio8_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, contador, aprobados, suspensos, condicionados;

        contador = 1; //Iniciado en 1 para ir consumiendo hasta 6 en el While.

        aprobados = 0;
        suspensos = 0;
        condicionados = 0;

        while (contador<=6) {
            System.out.println("Introduce la Nota:");
            num = sc.nextInt();
            contador++;  //Permitirá repetir tantas veces como se haya declarado en síntaxis del While.
                         //Iniciado anteriormente en 1. Ya que de 0 a 6 serían 7 y no 6.

            if (num > 4) {
                aprobados++;  //Cada vez que se repita el bucle, irá sumando esta variable una vez más.
            } else if (num == 4) {
                condicionados++; //Cada vez que se repita el bucle, irá sumando esta variable una vez más.
            } else {
                suspensos++; //Cada vez que se repita el bucle, irá sumando esta variable una vez más.
            }
        }

        System.out.println(); //Separación de línea.

        System.out.println("Hay " + aprobados + " Aprobados.");
        System.out.println("Hay " + condicionados + " Condicionados.");
        System.out.println("Hay " + suspensos + " Suspensos.");
    }
}
