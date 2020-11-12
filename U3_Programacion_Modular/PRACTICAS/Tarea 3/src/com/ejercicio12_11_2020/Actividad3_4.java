package com.ejercicio12_11_2020;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int logitud;

        System.out.println("Introduce el número de Dígitos de la Clave Secreta:");
        logitud = sc.nextInt();

        int combinacion_secreta[] = new int[logitud];
        int combinacion_jugador[] = new int[logitud];

        generarCombinacion(combinacion_secreta);
        System.out.println(Arrays.toString(combinacion_secreta));
        System.out.println("Escribe una Combinación:");
        leeTabla(combinacion_jugador);

        while (!Arrays.equals(combinacion_secreta, combinacion_jugador)) {
            mostrarPistas(combinacion_secreta, combinacion_jugador);
            System.out.println("Escribe una Combinación:");
            leeTabla(combinacion_jugador);
        }

        System.out.println("La Cámara Secreta se ha abierto:");
    }

    public static void generarCombinacion(int t[]) {
        final int MAX = 5;
        for (int i = 0; i < t.length; i++) {
            t[i] = (int) (Math.random() * MAX + 1);
        }
    }

    public static void leeTabla(int t[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < t.length; i++) {
            t[i] = sc.nextInt();
        }
    }

    public static void mostrarPistas(int secret[], int jug[]) {
        for (int i = 0; i < jug.length; i++) {
            System.out.print(jug[i]);
            if (secret[i] > jug[i]) {
                System.out.println(" es mayor");
            } else if (secret[i] < jug[i]) {
                System.out.println(" es menor");
            } else {
                System.out.println(" es igual");
            }
        }
    }
}