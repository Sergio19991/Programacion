package com.ejercicios27_10_2020;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura, num_espacios, i, j;

        System.out.println("Introduce la Altura del Rombo;");
        altura = sc.nextInt();

        num_espacios = (altura - 1) / 2;

        for (i = 0; i < altura; i++) {

            //Imprimir espacios
            for (j = 0; j < num_espacios; j++) {
                System.out.print(" ");
            }

            //Imprimir X
            for (j = 0; j < altura - 2 * num_espacios; j++) {
                System.out.print("*");
            }
            System.out.println("");

            if (i < altura / 2) {
                //Primer mitad.
                num_espacios--;
            } else {
                //Segunda mitad.
                num_espacios++;
            }
        }
    }
}
