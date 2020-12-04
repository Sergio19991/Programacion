package com.sergiobejaranaorroyo.Entregable_2021;

import java.util.Arrays;

public class ejercicio4 {
    public static void main(String[] args) {
        int[][] bidimensional = new int[5][9];
        int maximo = bidimensional[0][0];
        int minimo = bidimensional[0][0];

        for (int i = 0; i < bidimensional.length; i++) {
            for (int j = 0; j < bidimensional[i].length; j++) {
                bidimensional[i][j] = (int) (Math.random() * 900 + 100);
                if (i == 0) {
                    maximo = bidimensional[i][j];
                    minimo = bidimensional[i][j];
                } else if (bidimensional[i][j] > maximo) {
                    maximo = bidimensional[i][j];
                } else {
                    minimo = bidimensional[i][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(bidimensional));

        System.out.println("El Máximo es " + maximo + ".");
        System.out.println("El Mínimo es " + minimo + ".");
    }
}