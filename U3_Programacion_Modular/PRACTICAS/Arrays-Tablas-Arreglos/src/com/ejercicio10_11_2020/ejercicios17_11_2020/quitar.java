package com.ejercicio10_11_2020.ejercicios17_11_2020;

import java.util.Arrays;

public class quitar {
    public static void main(String[] args) {
        int[] a = {3, 5, 3, 6, 7, 9, 3};
        System.out.println(Arrays.toString(quitar(a, 3)));
    }

    public static int[] quitar(int[] v, int num) {
        int[] resultado;
        int contador = 0;

        for (int i = 0; i < v.length; i++) {
            if (v[i] == num) {
                contador++;
            }
        }

        if (contador == 0) {
            return v;
        } else {
            resultado = new int[v.length - contador];

            int pos = 0;

            for (int i = 0; i < v.length; i++) {
                if (v[i] != num) {
                    resultado[pos] = v[i];
                    pos++;
                }
            }
        }
        return resultado;
    }
}