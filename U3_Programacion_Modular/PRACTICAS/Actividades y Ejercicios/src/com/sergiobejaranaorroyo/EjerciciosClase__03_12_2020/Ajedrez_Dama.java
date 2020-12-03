package com.sergiobejaranaorroyo.EjerciciosClase__03_12_2020;

import java.util.Arrays;

public class Ajedrez_Dama {
    public static void main(String[] args) {
        int[] filas = {8, 7, 6, 5, 4, 3, 2, 1};
        String[] columnas = {"a", "b", "c", "d", "e", "f", "g", "h"};
        String[][] tablero = new String[8][8];
        int filaInicial = 5;
        int columnaInicial = 5;

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (i + j == filaInicial + columnaInicial || i - j == filaInicial - columnaInicial || i == filaInicial || j == columnaInicial) {
                    tablero[i][j] = "■";
                    System.out.print(columnas[j] + filas[i] + " ");
                } else {
                    tablero[i][j] = "□";
                }
            }
        }

        tablero[filaInicial][columnaInicial] = "♕";

        System.out.println();

        for (String[] fila : tablero) {
            System.out.println(Arrays.toString(fila));
        }
    }
}