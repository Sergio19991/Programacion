package com.sergiobejaranoarroyo;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dimension;

        do {
            System.out.print("Introduzca la altura de la pirámide maya: ");
            dimension = sc.nextInt();
        } while (dimension < 3);

        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension + i; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < i; j++) {
                System.out.println("*");
                for (int k = 0; k < j + i; k++) {
                    System.out.print("-");
                }

                for (int k = 0; k < dimension + j; k++) {
                    System.out.print("*");
                }

                for (int k = 0; k < dimension - i; k++) {
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }
}