package com.sergiobejaranaorroyo.EjerciciosClase__01_12_2020;

import java.util.Arrays;
import java.util.Scanner;

public class FiltrarMultiplos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vector;
        int tam;

        System.out.println("Introduce el Tamaño del Vector:");
        tam = sc.nextInt();

        vector = new int[tam];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 101);
        }

        System.out.println(Arrays.toString(vector));

        System.out.println(Arrays.toString(filtrarMultiplots(vector, 5)));
    }

    public static int[] filtrarMultiplots(int[] v, int num) {
        int[] resultado = new int[0];

        for (int i = 0; i < v.length; i++) {
            if (v[i] % num != 0) {
                resultado = Arrays.copyOf(resultado, resultado.length + 1);
                resultado[resultado.length - 1] = v[i];
            }
        }

        return resultado;
    }

}