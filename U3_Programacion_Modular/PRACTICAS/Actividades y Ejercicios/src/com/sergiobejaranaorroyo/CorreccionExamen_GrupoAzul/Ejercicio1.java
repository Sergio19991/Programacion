package com.sergiobejaranaorroyo.CorreccionExamen_GrupoAzul;

public class Ejercicio1 {
    public static void main(String[] args) {
        int[] v = {1, 2, 3, 4, 5, 6, 7, 8};

        for (int i = 0; i < 10; i++) {
            System.out.println(aleatorioDeArray(v));
        }
    }

    public static int aleatorioDeArray(int[] v) {
        int pos = (int) (Math.random() * v.length);

        return v[pos];
    }
}