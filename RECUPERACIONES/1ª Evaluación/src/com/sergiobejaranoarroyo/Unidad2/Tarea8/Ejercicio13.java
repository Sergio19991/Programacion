package com.sergiobejaranoarroyo.Unidad2.Tarea8;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota, cantidadAprobados = 0, cantidadCondicionados = 0, cantidadSuspensos = 0;

        for (int i = 0; i <= 6; i++) {
            System.out.print("Introduce una Nota: ");
            nota = sc.nextInt();

            if (nota >= 5) {
                cantidadAprobados++;
            }

            if (nota == 4) {
                cantidadCondicionados++;
            }

            if (nota < 4) {
                cantidadSuspensos++;
            }
        }

        System.out.println();

        System.out.println("Suspensos: " + cantidadSuspensos);
        System.out.println("Condicionados: " + cantidadCondicionados);
        System.out.println("Aprobados: " + cantidadAprobados);
    }
}