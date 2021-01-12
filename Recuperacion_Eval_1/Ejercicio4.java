package com.sergiobejaranoarroyo;

import java.util.Arrays;

public class Ejercicio4 {
    public static void main(String[] args) {
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        System.out.println(Arrays.toString(array));
    }

    public static int esPrimo(int[] array) {
        array = new int[0];
        int primo = 0;
        int resultado = 0;

        for (int i = 0; i < array.length; i++) {
            if (array.length % 2 == 0) {
                System.out.println("*" + array[i] + "*");
            }
        }

        return resultado;
    }
}