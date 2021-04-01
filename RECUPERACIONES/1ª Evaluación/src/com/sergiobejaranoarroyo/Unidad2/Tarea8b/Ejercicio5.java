package com.sergiobejaranoarroyo.Unidad2.Tarea8b;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura;
        String caracter;

        System.out.print("Introduce la Altura de la Pirámide: ");
        altura = sc.nextInt();
        System.out.print("Introduce el Carácter: ");
        caracter = sc.next();
        System.out.println();

        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }

            for (int p = 1; p <= (i * 2) - 1; p++) {
                System.out.print(caracter);
            }

            System.out.println();
        }
    }
}