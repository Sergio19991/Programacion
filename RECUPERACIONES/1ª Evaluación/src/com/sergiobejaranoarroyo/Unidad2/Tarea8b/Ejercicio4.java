package com.sergiobejaranoarroyo.Unidad2.Tarea8b;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int cantidadPositivos = 0;
        int cantidadNegativos = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Introduce un Número: ");
            numero = sc.nextInt();

            if (numero % 2 == 0) {
                cantidadPositivos++;
            } else {
                cantidadNegativos++;
            }
        }

        System.out.println("\nCantidad de Positviso: " + cantidadPositivos + ".");
        System.out.println("Cantidad de Negativos: " + cantidadNegativos + ".");
    }
}