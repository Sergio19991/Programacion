package com.sergiobejaranaorroyo.EjerciciosClase__01_12_2020;

import java.util.Arrays;
import java.util.Scanner;

public class CuadadroConSubmatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] numeros, v;
        int tam;

        System.out.println("Introduce el Tamaño del Vector:");
        tam = sc.nextInt();

        numeros = new int[tam][tam];

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = (int) (Math.random() * 101);
            }
        }

        for (int[] fila : numeros) {
            System.out.println(Arrays.toString(fila));
        }

        int fila, columna;

        System.out.println("Introduce la Fila:");
        fila = sc.nextInt();

        System.out.println("Introduce la Columna:");
        columna = sc.nextInt();

        System.out.println("Introduce el Tamaño de la Submatriz:");
        tam = sc.nextInt();

        System.out.println(Arrays.deepToString(submatriz(numeros, fila, columna, tam)));
    }

    public static int[][] submatriz(int[][] origen, int fila, int columna, int tam) {
        int[][] resltado;

        if (fila < 0 || fila >= origen.length || columna < 0 || columna >= origen[0].length || fila + (tam - 1) >= origen.length || columna + (tam - 1) >= origen[0].length) {
            System.out.println("Imposible obtener esa Submatriz.");
            int[][] resultado = {};
            return resultado;
        } else {
            resltado = new int[tam][tam];

            for (int i = fila; i < fila + tam; i++) {
                for (int j = columna; j < columna + tam; j++) {
                    resltado[i - fila][j - columna] = origen[i][j];
                }
            }
        }

        return resltado;
    }

}