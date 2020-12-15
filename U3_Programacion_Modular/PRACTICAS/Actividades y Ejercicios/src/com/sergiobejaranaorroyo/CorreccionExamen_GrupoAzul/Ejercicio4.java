package com.sergiobejaranaorroyo.CorreccionExamen_GrupoAzul;

import java.util.Arrays;

public class Ejercicio4 {
    public static void main(String[] args) {
        int[][] numeros = new int[5][5];

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = (int) (Math.random() * 90 + 10);
            }
        }

        for (int[] fila : numeros) {
            System.out.println(Arrays.toString(fila));
        }
        System.out.println(nEsino(numeros, 15));
        System.out.println(nEsino(numeros, 30));
        System.out.println(nEsino(numeros, 21));
    }

    public static int nEsino(int[][] n, int posicion) {
        if (posicion < 0 || posicion > n.length * n[0].length - 1) {
            return -1;
        } else {
            int pos = 0;
            for (int i = 0; i < n.length; i++) {
                for (int j = 0; j < n[i].length; j++) {
                    if (pos == posicion) {
                        return n[i][j];
                    } else {
                        pos++;
                    }
                }
            }
        }

        return -1;
    }

}