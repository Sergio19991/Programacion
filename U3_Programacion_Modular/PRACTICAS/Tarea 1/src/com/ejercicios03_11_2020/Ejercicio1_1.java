package com.ejercicios03_11_2020;

import java.util.Scanner;

public class Ejercicio1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Introduce el número de veces:");
        n = sc.nextInt();

        eco(n);   //Llamada a la función eco();.

    }

    public static void eco(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Eco...");
        }
    }

}