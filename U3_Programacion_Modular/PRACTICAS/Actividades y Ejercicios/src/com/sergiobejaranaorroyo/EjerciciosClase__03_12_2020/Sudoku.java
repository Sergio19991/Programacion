package com.sergiobejaranaorroyo.EjerciciosClase__03_12_2020;

import java.util.Arrays;
import java.util.Scanner;

public class Sudoku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] origen;
        int[][] destino;
        int tam;

        System.out.println("Introdue un Tamaño:");
        tam = sc.nextInt();

        origen = new int[tam][tam];
        destino = new int[tam + 1][tam + 1];

        for (int i = 0; i < origen.length; i++) {
            int suma = 0;
            for (int j = 0; j < origen[i].length; j++) {
                origen[i][j] = (int) (Math.random() * 10);
                destino[i][j] = origen[i][j];
                suma += origen[i][j];
            }

            destino[i][origen.length] = suma;
        }

        for (int i = 0; i < origen[0].length; i++) {
            int suma = 0;
            for (int j = 0; j < origen.length; j++) {
                suma += origen[j][i];
            }

            destino[origen.length][i] = suma;
        }

        imprimirMatriz(origen);
        imprimirMatriz(destino);
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            System.out.println(Arrays.toString(fila));
        }
    }

}