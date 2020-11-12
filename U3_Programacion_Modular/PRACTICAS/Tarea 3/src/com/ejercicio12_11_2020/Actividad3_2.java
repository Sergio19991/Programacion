package com.ejercicio12_11_2020;

import java.util.Scanner;

public class Actividad3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad_numeros;
        int i;

        System.out.println("¿Cuántos Números quiéres introducir?:");
        cantidad_numeros = sc.nextInt();

        int numeros[] = new int[cantidad_numeros];

        for (i = 0; i < numeros.length; i++) {
            System.out.println("Introduce un Número:");
            numeros[i] = sc.nextInt();
        }

        for (i = numeros.length - 1; i >= 0; i--) {
            System.out.println("Los Números en Orden Inverso, son " + numeros[i]);
        }
    }
}