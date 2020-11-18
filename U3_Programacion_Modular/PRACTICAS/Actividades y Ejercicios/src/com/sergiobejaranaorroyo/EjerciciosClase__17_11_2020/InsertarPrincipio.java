package com.sergiobejaranaorroyo.EjerciciosClase__17_11_2020;

import java.util.Arrays;

public class InsertarPrincipio {
    public static void main(String[] args) {
        int[] a = {3, 4, 5, 6, 7, 8};

        System.out.println(Arrays.toString(insertarPrincipio(a, 17)));
    }

    public static int[] insertarPrincipio(int[] v, int num) {
        int[] resultado = new int[v.length + 1];

        resultado[0] = num;

        for (int i = 0; i < v.length; i++) {
            resultado[i + 1] = v[i];
        }

        return resultado;
    }

}