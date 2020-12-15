package com.sergiobejaranaorroyo.CorreccionExamen_GrupoRojo;

public class Ejercicio2 {
    public static void main(String[] args) {
        int[] v = {23, 45, 4, 5, 6, 7, 8, 21, 34};

        System.out.println(convierteArrayEnString(v));
    }

    public static String convierteArrayEnString(int[] a) {
        String resultado = "";

        for (int i = 0; i < a.length; i++) {
            resultado += a[i];
        }

        return resultado;
    }

}