package com.sergiobejaranaorroyo.EjerciciosClase__20_11_2020;

import java.util.Arrays;
import java.util.Scanner;

public class Libro__Ejercicio5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = {};
        int num;

        do {
            System.out.println("Introduce un Número:");
            num = sc.nextInt();

            if (num != -1) {
                v = Arrays.copyOf(v, v.length + 1);
                v[v.length - 1] = num;
            }
        } while (num != -1);

        int max = v[0];
        int min = v[0];
        int suma = v[0];

        for (int i = 0; i < v.length; i++) {
            if (v[i] > max) {
                max = v[i];
            }

            if (v[i] < min) {
                min = v[i];
            }
        }

        System.out.println(Arrays.toString(v));
        System.out.println("El Máximo, es " + max);
        System.out.println("El Mínimo, es " + min);
        System.out.println("La Media, es " + (float) (suma / v.length));
    }
}