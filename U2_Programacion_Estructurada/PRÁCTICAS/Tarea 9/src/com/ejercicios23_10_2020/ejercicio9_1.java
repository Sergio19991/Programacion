package com.ejercicios23_10_2020;

import java.util.Scanner;

public class ejercicio9_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra1, palabra2;   //Declaro palabra1 y palabra2 como variables de tipo cadena.

        System.out.println("Introduce la Primera Palabra");
        palabra1 = sc.nextLine();
        System.out.println("Introduce la Seguna Palabra");
        palabra2 = sc.nextLine();

        System.out.println(" ");   //Salto de línea. Estética de cara al Usuario.

        if (palabra1.length() < palabra2.length()) {   //Comparo la longitud.
            System.out.println("La Palabra más corta es   " + palabra1);
        } else {
            System.out.println("La Palabra más corta es   " + palabra2);
        }
    }
}
