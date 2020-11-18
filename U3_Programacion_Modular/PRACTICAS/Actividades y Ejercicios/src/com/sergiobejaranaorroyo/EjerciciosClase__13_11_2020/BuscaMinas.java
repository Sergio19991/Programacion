package com.sergiobejaranaorroyo.EjerciciosClase__13_11_2020;

import java.util.Arrays;

public class BuscaMinas {
    public static void main(String[] args) {
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100 + 1);
        }
        System.out.println(Arrays.toString(numeros));
    }

}