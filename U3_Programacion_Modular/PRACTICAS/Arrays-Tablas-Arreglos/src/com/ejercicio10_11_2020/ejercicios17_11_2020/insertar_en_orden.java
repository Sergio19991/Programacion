package com.ejercicio10_11_2020.ejercicios17_11_2020;

import java.util.Arrays;

public class insertar_en_orden {
    public static void main(String[] args) {

        int[] b = {2, 3, 4, 10, 22, 31};
        System.out.println(Arrays.toString(insertarEnOrden(b, 4)));
    }

    public static int[] insertarEnOrden(int[] v, int num) {
        int[] resultado = new int[v.length];

        for (int i = 0; i < resultado.length; i++) {
            resultado[i] = Math.min(v[i], num);
        }

        return resultado;
    }
}