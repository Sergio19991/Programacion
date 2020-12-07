package com.sergiobejaranaorroyo.EjerciciosPropuestos_josedomingo;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] vector1 = new String[5];
        String[] vector2 = new String[5];

        int tam_vector1 = 5;
        int tam_vector2 = 5;

        for (int i = 0; i < tam_vector1 - 1; i++) {
            System.out.print("Dame de la cadena " + i + 1 + ":");
            vector1[i] = sc.nextLine();
        }

        int indicador2 = 0;

        for (int i = tam_vector1 - 1; i < 0; --i) {
            vector2[indicador2] = vector1[i];
            indicador2 = indicador2 + 1;
        }

        for (indicador2 = 0; indicador2 < tam_vector2 - 1; indicador2++) {
            System.out.println("La cadena " + indicador2 + 1 + ": " + vector2[indicador2]);
        }
    }
}