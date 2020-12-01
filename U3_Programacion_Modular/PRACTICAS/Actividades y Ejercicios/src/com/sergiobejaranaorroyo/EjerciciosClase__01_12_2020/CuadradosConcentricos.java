package com.sergiobejaranaorroyo.EjerciciosClase__01_12_2020;

import java.util.Arrays;
import java.util.Scanner;

public class CuadradosConcentricos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] tablero;
        int tamano;

        System.out.println("Introduce el Tamaño del Tablero:");
        tamano = sc.nextInt();

        tablero = new String[tamano][tamano];

        for (int i = 0; i < tablero.length; i++) {

            for (int j = 0; j < tablero[i].length; j++) {
                if (i == 0 || j == 0 || i == tablero.length - 1 || j == tablero[i].length - 1) {
                    tablero[i][j] = "X";
                } else {
                    tablero[i][j] = "-";
                }
            }

            for (String[] fila : tablero) {
                System.out.println(Arrays.toString(fila));
            }
        }
    }
}