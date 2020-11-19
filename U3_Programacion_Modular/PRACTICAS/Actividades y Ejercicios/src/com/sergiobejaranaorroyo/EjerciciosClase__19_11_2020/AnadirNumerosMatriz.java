package com.sergiobejaranaorroyo.EjerciciosClase__19_11_2020;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AnadirNumerosMatriz {
    public static void main(String[] args) {
        int[][] tabla = {{2, 3, 5, 4}, {8, 11, 10, 4}, {1, 0, 7, 5}};

        System.out.println(Arrays.deepToString(sudoku(tabla)));

    }

    public static int[][] sudoku(int[][] m) {
        int[][] resultado = new int[m.length + 1][m[0].length + 1];


        //Calcula la suma de las Filas:
        for (int i = 0; i < m.length; i++) {

            int suma = 0;

            for (int j = 0; j < m[i].length; j++) {
                suma += m[i][j];
                resultado[i][j] = m[i][j];
            }

            resultado[i][m[i].length] = suma;
        }

        //Calcula la suma de las Columnas:
        for (int i = 0; i < m[0].length; i++) {

            int suma = 0;

            for (int j = 0; j < m.length; j++) {
                suma += m[j][i];
            }

            resultado[m.length][i] = suma;
        }

        return resultado;
    }

}