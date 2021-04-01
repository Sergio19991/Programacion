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

            if (numero > 0) {
                cantidadPositivos++;
            }

            if (numero < 0) {
                cantidadNegativos++;
            }
        }

        System.out.println();

        System.out.println("Cantidad de Positivos: " + cantidadPositivos);
        System.out.println("Cantidad de Negativos: " + cantidadNegativos);
    }
}