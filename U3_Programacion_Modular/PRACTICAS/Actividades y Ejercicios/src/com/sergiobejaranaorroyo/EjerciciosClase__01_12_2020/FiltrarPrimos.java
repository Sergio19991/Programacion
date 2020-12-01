package com.sergiobejaranaorroyo.EjerciciosClase__01_12_2020;

import java.util.Arrays;
import java.util.Scanner;

public class FiltrarPrimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vector;
        int tamano;

        System.out.println("Introduce el Tamaño del Vector:");
        tamano = sc.nextInt();

        vector = new int[tamano];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 101);
        }

        System.out.println(Arrays.toString(vector));

        System.out.println(Arrays.toString(filtrarPrimos(vector)));
    }

    public static int[] filtrarPrimos(int[] v) {
        int[] resultado = {};

        for (int i = 0; i < v.length; i++) {
            if (!esPrimo(v[i])) {
                resultado = Arrays.copyOf(resultado, resultado.length + 1);
                resultado[resultado.length - 1] = v[i];
            }
        }

        return resultado;
    }

    public static boolean esPrimo(int num) {
        if (num == 1) {
            return true;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }

            return true;
        }
    }

}