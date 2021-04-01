package com.sergiobejaranoarroyo.Unidad2.Tarea9;

import java.util.Scanner;

public class Actividad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra1, palabra2;

        System.out.print("Introduce la Primera Palabra: ");
        palabra1 = sc.next();
        System.out.print("Introduce la Segunda Palabra: ");
        palabra2 = sc.next();

        System.out.println();

        if (palabra1.length() < palabra2.length()) {
            System.out.println("La Palabra más corta es " + palabra1);
        } else {
            System.out.println("La Palabra más corta es " + palabra2);
        }
    }
}