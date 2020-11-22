package com.sergiobejaranaorroyo.Tarea3_EjerciciosAdicionales;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        int min = 0;
        int max = 0;

        int[] numeros = new int[100];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 500 + 1);
            if (i == 0) {
                min = numeros[i];
                max = numeros[i];
            } else {
                if (numeros[i] > max) {
                    max = numeros[i];
                }
                if (numeros[i] < min) {
                    min = numeros[i];
                }
            }
        }
        System.out.print("La tabla rellena, es " + Arrays.toString(numeros));
        System.out.println(" ");

        System.out.println("¿Qué quiere destacar? (1 - mínimo, 2 - máximo):");
        opcion = sc.nextInt();

        if (opcion == 1) {
            System.out.println("El Mínimo, es " + min);
        } else if (opcion == 2) {
            System.out.println("El Máximo, es " + max);
        }
    }
}