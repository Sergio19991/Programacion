package com.sergiobejaranaorroyo.EjerciciosClase__17_11_2020;

import java.util.Arrays;

public class InsertarFinal {
    public static void main(String[] args) {
        int[] a = {3, 4, 5, 6, 7, 8};

        System.out.println(Arrays.toString(insertarFinal(a, 17)));
    }

    public static int[] insertarFinal(int[] v, int num) {
        int[] resultado = new int[v.length + 1];

        for (int i = 0; i < v.length; i++) {
            resultado[i] = v[i];
        }

        resultado[resultado.length - 1] = num;

        return resultado;
    }

}