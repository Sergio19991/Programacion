package com.sergiobejaranoarroyo;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura, fila, columna;

        do {
            System.out.println("Introduzca la altura de la flecha:");
            altura = sc.nextInt();
        } while (altura % 2 != 1 && altura >= 3);

        for (fila = 0; fila <= altura; fila++) {
            for (columna = 0; columna <= fila; columna++) {
                if (altura < fila && altura < 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("********");
        }

        System.out.println();
    }
}