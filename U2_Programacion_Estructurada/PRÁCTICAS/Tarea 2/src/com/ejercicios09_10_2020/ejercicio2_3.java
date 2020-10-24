package com.ejercicios09_10_2020;

import java.util.Scanner;

public class ejercicio2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dividendo, divisor;

        System.out.println("Introduce el Dividendo:");
        dividendo = sc.nextInt();
        System.out.println("Introduce el Divisor:");
        divisor = sc.nextInt();

        System.out.println("El resultado de Dividir " + dividendo + " entre " + divisor + " es " + (dividendo/divisor) + ".");
    }
}
