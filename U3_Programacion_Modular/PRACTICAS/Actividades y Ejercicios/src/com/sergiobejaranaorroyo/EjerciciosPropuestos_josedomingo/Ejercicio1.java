package com.sergiobejaranaorroyo.EjerciciosPropuestos_josedomingo;

import java.util.Arrays;

public class Ejercicio1 {
    public static void main(String[] args) {
        int[] vector_numreos = new int[10];

        for (int i = 0; i < vector_numreos.length; i++) {
            vector_numreos[i] = (int) (Math.random() * 10 + 1);
        }

        for (int i = 0; i < 9; i++) {
            System.out.println(vector_numreos[i] + " - " + Math.pow(vector_numreos[i], 2) + " - " + Math.pow(vector_numreos[i], 3));
        }
    }
}