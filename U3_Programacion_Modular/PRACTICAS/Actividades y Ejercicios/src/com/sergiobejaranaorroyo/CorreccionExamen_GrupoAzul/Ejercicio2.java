package com.sergiobejaranaorroyo.CorreccionExamen_GrupoAzul;

import java.util.Arrays;

public class Ejercicio2 {
    public static void main(String[] args) {
        int[] v = {1, 2, 3, 4, 5, 6};

        System.out.println(Arrays.toString(insertarValor(v, 2, 55)));
        System.out.println(Arrays.toString(insertarValor(v, 200, 55)));
    }

    public static int[] insertarValor(int[] v, int pos, int valor) {
        int[] resultado = new int[0];

        if (pos < 0 || pos >= v.length) {
            return v;
        } else {
            for (int i = 0; i < v.length; i++) {
                if (i == pos) {
                    resultado = Arrays.copyOf(resultado, resultado.length + 1);
                    resultado[resultado.length - 1] = valor;
                }
                resultado = Arrays.copyOf(resultado, resultado.length + 1);
                resultado[resultado.length - 1] = v[i];
            }
        }

        return resultado;
    }

}