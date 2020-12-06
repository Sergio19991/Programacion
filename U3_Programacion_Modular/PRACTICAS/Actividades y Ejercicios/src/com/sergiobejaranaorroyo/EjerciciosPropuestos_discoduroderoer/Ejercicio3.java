package com.sergiobejaranaorroyo.EjerciciosPropuestos_discoduroderoer;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un tamaño");
        int tamanio = sc.nextInt();

        int matriz1[][] = new int[tamanio][tamanio];
        int matriz2[][] = new int[tamanio][tamanio];

        int resultado[][] = new int[tamanio][tamanio];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {

                System.out.println("Escriba el valor para la fila " + i + " y columna " + j + " de la matriz 1");
                matriz1[i][j] = sc.nextInt();
                System.out.println("Escriba el valor para la fila " + i + " y columna " + j + " de la matriz 2");
                matriz2[i][j] = sc.nextInt();

                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        System.out.println("Matriz 1");
        muestraMatriz(matriz1);

        System.out.println("Matriz 2");
        muestraMatriz(matriz2);

        System.out.println("Matriz resultante");
        muestraMatriz(resultado);
    }

    public static void muestraMatriz(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }

    }

}