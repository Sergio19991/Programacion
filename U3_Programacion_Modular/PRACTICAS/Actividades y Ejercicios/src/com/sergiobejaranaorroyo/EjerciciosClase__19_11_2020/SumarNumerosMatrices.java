package com.sergiobejaranaorroyo.EjerciciosClase__19_11_2020;

import java.util.Arrays;

public class SumarNumerosMatrices {
    public static void main(String[] args) {
        int[][] matriz = {{2, 21, 4}, {22, 3, 4}, {2, 36, 4}};

        System.out.println(suma(matriz));
    }

    public static int suma(int[][] m) {
        int sum = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                sum += m[i][j];
            }
        }

        return sum;
    }

}