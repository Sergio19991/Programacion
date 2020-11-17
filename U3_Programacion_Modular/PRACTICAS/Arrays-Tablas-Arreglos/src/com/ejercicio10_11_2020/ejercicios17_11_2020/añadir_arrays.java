package com.ejercicio10_11_2020.ejercicios17_11_2020;

import java.util.Arrays;

public class añadir_arrays {
    public static void main(String[] args) {
        int[] a = {3, 4, 5, 6, 7, 8};

        System.out.println(Arrays.toString(inserPos(a, 2, 9)));
    }

    public static int[] inserPos(int[] v, int pos, int num) {
        if (pos < 0 || pos >= v.length) {
        }

        int[] resultado = new int[v.length + 1];

        for (int i = 0; i < v.length; i++) {
            if (i < pos) {
                resultado[i] = v[i];
            } else if (i == pos) {
                resultado[i] = num;
            } else {
                resultado[i] = v[i - 1];
            }
        }
        resultado[resultado.length - 1] = v[v.length - 1];
        return resultado;
    }
}