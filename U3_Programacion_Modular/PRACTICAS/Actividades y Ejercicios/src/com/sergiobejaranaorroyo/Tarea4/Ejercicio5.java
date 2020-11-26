package com.sergiobejaranaorroyo.Tarea4;

import java.util.Arrays;

public class Ejercicio5 {
    public static void main(String[] args) {
        int[][] numeros = new int[10][10];
        int maximo = 0;
        int minimo = 0;
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = (int) (Math.random() * 101 + 200);
                if (i == 0 && j == 0) {
                    maximo = numeros[i][j];
                    minimo = numeros[i][j];
                }

                if (i == j) {

                    suma += numeros[i][j];
                    if (numeros[i][j] > maximo) {
                        maximo = numeros[i][j];
                    }
                    if (numeros[i][j] < minimo) {
                        minimo = numeros[i][j];
                    }
                }
            }
        }


        for (int[] fila : numeros) {
            System.out.println(Arrays.toString(fila));
        }

        System.out.println("El mayor es " + maximo);
        System.out.println("El menor es " + minimo);
        System.out.println("La media es " + (double) suma / 10);
    }
}