package com.sergiobejaranaorroyo.CorreccionExamen_GrupoRojo;

import java.util.Arrays;

public class Ejercicio3 {
    public static void main(String[] args) {
        String[] paises = {"España", "Rusia", "Japón", "Australia"};
        int[][] datos = new int[4][10];
        int max = 0;
        int min = 0;
        int suma = 0;

        for (int i = 0; i < datos.length; i++) {
            suma = 0;
            for (int j = 0; j < datos[i].length; j++) {
                datos[i][j] = (int) (Math.random() * 70 + 140);
                suma += datos[i][j];
                if (j == 0) {
                    min = datos[i][j];
                    max = datos[i][j];
                } else {
                    if (datos[i][j] > max) {
                        max = datos[i][j];
                    }
                    if (datos[i][j] < min) {
                        min = datos[i][j];
                    }
                }
            }

            System.out.print(paises[i] + "|");
            System.out.print(Arrays.toString(datos[i]));
            System.out.print(" " + suma / 10);
            System.out.print(" " + min);
            System.out.println(" " + max);
        }
    }
}