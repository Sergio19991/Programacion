package com.sergiobejaranaorroyo.EjerciciosClase__17_11_2020;

import java.util.Arrays;

public class QuitarNumero {
    public static void main(String[] args) {
        int[] a = {5, 17, 6, 7, 9, 17};

        System.out.println(Arrays.toString(quitar(a, 17)));
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