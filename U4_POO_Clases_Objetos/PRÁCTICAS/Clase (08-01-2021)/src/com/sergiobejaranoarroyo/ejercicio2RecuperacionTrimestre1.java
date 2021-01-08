package com.sergiobejaranoarroyo;

import java.util.Scanner;

public class ejercicio2RecuperacionTrimestre1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num;
        String pares = "Número Pares: ";
        long suma = 0;

        System.out.println("Por favor, introduzca un número entero positivo: ");
        num = sc.nextLong();

        String cadena = Long.toString(num);

        for (int i = 0; i < cadena.length(); i++) {
            if (Long.parseLong("" + cadena.charAt(i)) % 2 == 0) {
                pares += " " + cadena.charAt(i);
                suma += Long.parseLong("" + cadena.charAt(i));
            }
        }

        System.out.println(pares);
        System.out.println("SUMA: " + suma);
    }
}