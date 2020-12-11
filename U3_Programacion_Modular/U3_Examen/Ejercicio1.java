package com.sergiobejaranoarroyo;

import java.util.Arrays;

public class Ejercicio1 {
    public static void main(String[] args) {
        int[] vectorA = new int[4];
        int[] vectorB = new int[2];

        System.out.println(Arrays.toString(aleatorioDeArray(vectorA, vectorB)));
    }

    public static int[] aleatorioDeArray(int[] a, int[] b) {
        int[] resultado = aleatorioDeArray(a, b);

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 500);
        }

        for (int i = 0; i < b.length; i++) {
            b[i] = (int) (Math.random() * 500);
        }

        return resultado;
    }

}