package com.sergiobejaranoarroyo.PrimeraParte;

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long numeroIntroducido, numeroBasura, reverso = 0, numeroDigitos = 0, digito, totalPares = 0;
        int divisor = 10;

        System.out.print("Por favor, introduzca un número entero positivo: ");
        numeroIntroducido = sc.nextLong();

        System.out.print("Dígitos pares: ");

        numeroBasura = numeroIntroducido;

        while (numeroBasura > 0) {
            reverso = ((reverso * 10) + (numeroBasura % 10));
            numeroBasura /= 10;
            numeroDigitos++;
        }

        for (int i = 0; i < numeroDigitos; i++) {
            digito = reverso % 10;

            if (digito % 2 == 0) {
                System.out.print(digito + " ");
                totalPares += digito;
            }

            reverso /= 10;
        }

        System.out.println();

        System.out.println("Suma de los dígitos pares: " + totalPares);
    }
}