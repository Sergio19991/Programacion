package com.primeraParte;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numero = new int[10];
        int[] resultado = new int[10];
        int cont = 0, array = 0, primo = 0, prueba = 0;

        System.out.println("Introduce 10 Números:");

        for (int i = 0; i < numero.length; i++) {
            System.out.println(i + 1 + ", ");
            numero[i] = sc.nextInt();
        }

        System.out.println("\nArray inicial");
        System.out.println("índice\tValor");

        for (int i = 0; i < 10; i++) {
            System.out.println(i + "          " + numero[i]);
        }

        for (int i = 0; i < 10; i++) {
            do {
                primo++;
                prueba = numero[i] % primo;
                if (prueba == 0) {
                    cont++;
                }
            } while (primo != numero[i]);

            if (cont == 2) {
                resultado[array] = numero[i];
                array++;
            } else {
                cont = 0;
                primo = 0;
            }

            for (int j = 0; j < 10; j++) {
                do {
                    primo++;
                    prueba = numero[i] % primo;
                    if (prueba == 0) {
                        cont++;
                    }
                } while (primo != numero[i]);
                if (cont != 2) {
                    resultado[array] = numero[i];
                    array++;
                }

                cont = 0;
                primo = 0;
            }

            System.out.println("\nArray final");
            System.out.println("índice\tValor");

            for (int j = 0; j < 10; j++) {
                System.out.println(i + "          " + resultado[i]);
            }
        }
    }
}