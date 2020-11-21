package com.sergiobejaranaorroyo.EjerciciosClase__20_11_2020;

import java.util.Arrays;

public class Libro__Ejercicio5_2 {
    public static void main(String[] args) {
        int[] original = {3, 5, 1, 4};

        System.out.println(Arrays.toString(ordenarConIndices(original)));
    }

    public static int[] ordenarConIndices(int[] orig) {
        int[] aux = Arrays.copyOf(orig, orig.length);
        int[] index = new int[orig.length];

        Arrays.sort(aux);

        for (int i = 0; i < aux.length; i++) {

            for (int j = 0; j < orig.length; j++) {
                if (orig[j] == aux[i]) {
                    index[i] = j;
                }
            }
        }

        return index;
    }

}