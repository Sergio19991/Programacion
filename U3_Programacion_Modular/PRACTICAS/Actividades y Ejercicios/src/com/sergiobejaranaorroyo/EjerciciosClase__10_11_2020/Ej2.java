package com.sergiobejaranaorroyo.EjerciciosClase__10_11_2020;

import java.util.Arrays;
import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[5];
        double suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce número:");
            numeros[i] = sc.nextDouble();
            suma += numeros[i];
        }

        System.out.println(Arrays.toString(numeros));
        System.out.println("La medie es: " + (suma / numeros.length));
    }

}