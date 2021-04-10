package com.sergiobejaranoarroyo.Unidad2.Tarea8;

import java.util.Scanner;

public class Actividad12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int calificacion, suspenso = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Introduce la Calificación: ");
            calificacion = sc.nextInt();

            if (calificacion < 5) {
                suspenso++;
            }
        }

        if (suspenso > 0) {
            System.out.println("\nHay " + suspenso + " Suspensos.");
        } else {
            System.out.println("\nNo hay ningún Suspenso.");
        }
    }
}