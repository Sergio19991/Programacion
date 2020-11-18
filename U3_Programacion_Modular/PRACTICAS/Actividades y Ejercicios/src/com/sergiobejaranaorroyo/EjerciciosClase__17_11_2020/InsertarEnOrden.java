package com.sergiobejaranaorroyo.EjerciciosClase__17_11_2020;

import java.util.Arrays;

public class InsertarEnOrden {
    public static void main(String[] args) {
        int[] b = {2, 5, 7, 19, 21};

        System.out.println(Arrays.toString(insertarEnOrden(b, 17)));
    }

    public static int[] insertarEnOrden(int[] v, int num) {
        int[] resultado = new int[v.length + 1];

        for (int i = 0; i < v.length; i++) {
            if (v[i] < num) {
                resultado[i] = v[i];
            } else {
                resultado[i] = num;
            }
        }

        return resultado;
    }

}