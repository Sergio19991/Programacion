package com.sergiobejaranoarroyo.Unidad2.Tarea8b;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura;
        String caracter;

        System.out.print("Introduce la Altura: ");
        altura = sc.nextInt();
        System.out.print("Introduce el Carácter: ");
        caracter = sc.next();

        int espacios = altura - 1;

        System.out.println();

        for (int i = 1; i <= altura; i++) {
            for (int j = 0; j < espacios; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < ((2 * altura) - 1 * espacios); j++) {
                if ((j == 0) || (j == ((2 * altura) - 1) - 2 * espacios - 1) || (i == altura)) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();

            espacios--;
        }
    }
}