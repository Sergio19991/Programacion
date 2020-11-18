package com.sergiobejaranaorroyo.EjerciciosClase__10_11_2020;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] numeros = new long[10];
        long num;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce un Núero Entero:");
            numeros[i] = sc.nextLong();
        }

        do {
            System.out.println("Dime el Número que quieres buscar:");
            num = sc.nextLong();
            boolean esta = false;
            for (long numero : numeros) {
                if (numero == num) {
                    esta = true;
                    break;
                }
            }
            if (esta) {
                System.out.println("El Número " + num + " SÍ está.");
            } else {
                System.out.println("El Número " + num + " No está.");
            }
        } while (num != -1);
    }

}