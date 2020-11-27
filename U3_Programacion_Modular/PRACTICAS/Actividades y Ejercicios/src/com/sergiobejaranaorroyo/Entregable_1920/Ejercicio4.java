package com.sergiobejaranaorroyo.Entregable_1920;

import java.util.Arrays;

public class Ejercicio4 {
    public static void main(String[] args) {
        int[] numeros = new int[(int) (Math.random() * 30 + 1)];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 1001);
        }

        System.out.println(Arrays.toString(numeros));

        System.out.println(convierteArrayEnString(numeros));

    }

    public static String convierteArrayEnString(int[] numeros) {
        String resultado = "";

        for (int num : numeros) {
            resultado += Integer.toString(num);
        }
        return resultado;
    }

}