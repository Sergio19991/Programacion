package com.sergiobejaranaorroyo.EjerciciosClase__19_11_2020;

import java.util.Arrays;

public class Matrices {
    public static void main(String[] args) {
        int[][] matriz1 = {{2, 3, 4}, {2, 3, 4}, {2, 3, 4}};
        int[][] matriz2 = new int[3][3];

        System.out.println(Arrays.deepToString(matriz1));   //Hace falta "deepToString" para sacar un vetor con más de una matriz, es decit, bidireccional en adelante (de 2 en adelante).

        System.out.println(Arrays.deepToString(matriz2));

        System.out.println(matriz1[1][1]);   //Posición BLOQUE1(2ª posición) y NÚMERO1(2ª posición).

        System.out.println(Arrays.toString(matriz1[1]));

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.println(matriz1[i][j]);
            }
        }
    }
}