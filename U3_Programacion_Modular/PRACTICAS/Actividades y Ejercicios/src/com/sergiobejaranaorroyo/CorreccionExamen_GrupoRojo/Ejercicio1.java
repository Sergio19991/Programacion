package com.sergiobejaranaorroyo.CorreccionExamen_GrupoRojo;

import java.util.Arrays;

public class Ejercicio1 {
    public static void main(String[] args) {
        int[] v1 = {1, 2, 3, 4, 1, 2, 31};
        int[] v2 = {1, 6, 8, 9, 0, 3, 45, 22};

        System.out.println(Arrays.toString(unirSinRepetidos(v1, v2)));
    }

    public static boolean esta(int[] v, int n) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] == n) {
                return true;
            }
        }

        return false;
    }

    public static int[] unirSinRepetidos(int[] v1, int[] v2) {
        int[] resultado = new int[0];

        for (int i = 0; i < v1.length; i++) {
            if (!esta(resultado, v1[i])) {
                resultado = Arrays.copyOf(resultado, resultado.length + 1);
                resultado[resultado.length - 1] = v1[i];
            }
        }

        for (int i = 0; i < v2.length; i++) {
            if (!esta(resultado, v2[i])) {
                resultado = Arrays.copyOf(resultado, resultado.length + 1);
                resultado[resultado.length - 1] = v2[i];
            }
        }

        return resultado;
    }

}