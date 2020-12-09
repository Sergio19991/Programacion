package com.sergiobejaranaorroyo.EjerciciosPropuestos_josedomingo;

public class Ejercicio11 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        int numeroFilas = 5, numeroColumnas = 5, fila, columna, suma;

        for (fila = 0; fila < numeroFilas - 1; fila++) {
            for (columna = 0; columna < numeroColumnas - 1; columna++) {
                if (fila == columna || fila == (numeroFilas - 1) - columna) {
                    matriz[fila][columna] = 1;
                } else {
                    matriz[fila][columna] = 0;
                }
            }

            for (fila = 0; fila < numeroFilas - 1; fila++) {
                for (columna = 0; columna < numeroColumnas - 1; columna++) {
                    System.out.print(matriz[fila][columna]);
                }

                System.out.println(" ");
            }
        }
    }
}