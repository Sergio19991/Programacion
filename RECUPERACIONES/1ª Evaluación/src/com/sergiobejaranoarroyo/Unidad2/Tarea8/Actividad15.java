package com.sergiobejaranoarroyo.Unidad2.Tarea8;

import java.util.Scanner;

public class Actividad15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int cantidadPrimos = 0;
        boolean numeroPrimo;

        System.out.print("Introduce un Número: ");
        n = sc.nextInt();
        System.out.println();

        for (int i = 1; i <= n; i++) {
            numeroPrimo = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    numeroPrimo = false;
                    break;
                }
            }

            if (numeroPrimo == true) {
                System.out.println(i + "-> primo");
                cantidadPrimos++;
            } else {
                System.out.println(i + "-> no primo");
            }
        }

        System.out.println("\n" + "Ente 1 y " + n + " hay " + cantidadPrimos + " número primos.");
    }
}