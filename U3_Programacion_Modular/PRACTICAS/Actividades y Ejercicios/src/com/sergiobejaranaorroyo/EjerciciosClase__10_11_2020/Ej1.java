package com.sergiobejaranaorroyo.EjerciciosClase__10_11_2020;

import java.util.Arrays;

public class Ej1 {
    public static void main(String[] args) {
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100 + 1);
        }
        System.out.println(Arrays.toString(numeros));
    }

}