package com.primeraParte;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la altura de la U: ");
        int altura = sc.nextInt();

        if (altura > 3) {
            for (int i = 0; i < altura - 1; i++) {
                System.out.print("*");

                for (int j = 0; j < 5; j++) {
                    System.out.print(" ");
                }

                System.out.println("*");
            }

            for (int i = 0; i < 3; i++) {
                System.out.print(" *");
            }
        } else {
            for (int i = 0; i < altura - 1; i++) {
                System.out.print("*");

                for (int j = 0; j < 5; j++) {
                    System.out.print(" ");
                }

                System.out.println("*");
            }

            for (int i = 0; i < 3; i++) {
                System.out.print(" *");
            }
        }
    }
}