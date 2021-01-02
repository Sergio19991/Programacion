package com.primeraParte;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, introduzca un número entero positivo: ");
        long numeroUsuario = sc.nextLong();

        System.out.print("Dígitos pares: ");

        int div = 10;
        long numBasura = numeroUsuario;
        long reves = 0;
        int numeroDigitos = 0;

        while (numBasura > 0) {
            reves = ((reves * 10) + (numBasura % 10));
            numBasura /= 10;
            numeroDigitos++;
        }

        long digito;
        long suma = 0;

        for (int i = 0; i < numeroDigitos; i++) {
            digito = reves % 10;

            if (digito % 2 == 0) {
                System.out.print(digito + " ");
                suma += digito;
            }

            reves /= 10;
        }

        System.out.println();

        System.out.print("Suma de los dígitos pares: " + suma);
    }
}