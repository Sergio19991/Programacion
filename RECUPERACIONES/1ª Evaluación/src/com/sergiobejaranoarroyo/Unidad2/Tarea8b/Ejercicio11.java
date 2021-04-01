package com.sergiobejaranoarroyo.Unidad2.Tarea8b;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura;

        do {
            System.out.print("Introduce la Altura de la X: ");
            altura = sc.nextInt();
        } while (altura < 3 || altura % 2 == 0);

        System.out.println();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                if (i == j || i + j == altura - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}