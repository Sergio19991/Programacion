package com.sergiobejaranaorroyo.EjerciciosPropuestos_josedomingo;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] notas = new int[5];
        double notaMedia;
        int tamanoNotas = 5, suma = 0, notaMaxima, notaMinima;

        for (int i = 0; i < tamanoNotas - 1; i++) {
            do {
                System.out.println("Introduce la Nota:");
                notas[i] = sc.nextInt();
            } while (notas[i] >= 0 && notas[i] <= 10);
        }

        notaMaxima = notas[0];
        notaMinima = notas[0];

        for (int i = 0; i < tamanoNotas - 1; i++) {
            suma = suma + notas[i];

            if (notas[i] > notaMaxima) {
                notaMinima = notas[i];
            }
        }

        notaMedia = suma / tamanoNotas;

        System.out.println(" ");

        System.out.print("Notas:");

        for (int i = 0; i < tamanoNotas - 1; i++) {
            System.out.println(notas[i] + " ");
        }

        System.out.println(" ");

        System.out.println("Nota Media: " + notaMedia);
        System.out.println("Nota Máxima: " + notaMaxima);
        System.out.println("Nota Mínima: " + notaMinima);
    }
}