package com.sergiobejaranoarroyo;

import java.util.Arrays;

public class Ejercicio5 {
    public static void main(String[] args) {
        int[][] tabla = new int[4][4];

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i][j]; j++) {
                tabla[i][j] = (int) (Math.random() * 100);
            }
        }

        System.out.println(Arrays.deepToString(tabla));
    }

    public static int[][] eliminarFilasPares(int[][] matriz) {

    }

    public static int[][] eliminarFilasImapares(int[][] matriz) {

    }
}