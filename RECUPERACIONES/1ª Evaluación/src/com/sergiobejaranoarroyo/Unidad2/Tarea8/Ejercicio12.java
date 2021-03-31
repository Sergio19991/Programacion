package com.sergiobejaranoarroyo.Unidad2.Tarea8;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int calificacion, cantidadSuspensos = 0;

        for (int i = 0; i <= 5; i++) {
            System.out.print("Introduce la Calificación: ");
            calificacion = sc.nextInt();

            if (calificacion < 5) {
                cantidadSuspensos++;
            }
        }


        System.out.println();

        if (cantidadSuspensos == 0) {
            System.out.println("No hay ningún suspenso.");
        } else {
            System.out.println("Hay " + cantidadSuspensos + " suspensos.");
        }
    }
}