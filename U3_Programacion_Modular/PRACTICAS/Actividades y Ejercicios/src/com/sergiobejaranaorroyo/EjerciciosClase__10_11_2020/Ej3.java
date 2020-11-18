package com.sergiobejaranaorroyo.EjerciciosClase__10_11_2020;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[8];
        int min = 0;
        int max = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce número:");
            numeros[i] = sc.nextInt();
            if (i == 0) {
                min = numeros[i];
                max = numeros[i];
            } else {
                if (numeros[i] > max) {
                    max = numeros[i];
                }
                if (numeros[i] < min) {
                    min = numeros[i];
                }
            }
        }

        System.out.println("El Máximo es " + max);
        System.out.println("El Mínimo es " + min);
    }

}