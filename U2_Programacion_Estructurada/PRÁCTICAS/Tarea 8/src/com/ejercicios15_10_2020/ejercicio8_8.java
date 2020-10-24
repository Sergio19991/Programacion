package com.ejercicios15_10_2020;

import java.util.Scanner;

public class ejercicio8_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, resultado;

        System.out.println("Introduce el Número:");
        num = sc.nextInt();

        resultado = 1;

        for (int i=num ; i>=1 ; i--) {
            resultado = resultado*i;
        }

        System.out.println("El Factorial de " + num + " es " + resultado + ".");
    }
}
