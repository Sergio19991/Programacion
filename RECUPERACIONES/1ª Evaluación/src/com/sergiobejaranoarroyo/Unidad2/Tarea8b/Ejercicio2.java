package com.sergiobejaranoarroyo.Unidad2.Tarea8b;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.print("Introduce un Número: ");
        numero = sc.nextInt();
        System.out.println();

        for (int i = numero + 1; i <= numero + 5; i++) {
            System.out.println("     Número: " + i + "     Cuadrado: " + (int) (Math.pow(i, 2)) + "     Cubo: " + (int) (Math.pow(i, 3)));
        }
    }
}