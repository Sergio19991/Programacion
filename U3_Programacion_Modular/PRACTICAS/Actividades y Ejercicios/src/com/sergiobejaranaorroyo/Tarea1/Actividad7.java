package com.sergiobejaranaorroyo.Tarea1;

import java.util.Scanner;

public class Actividad7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Introduce un Número:");
        numero = sc.nextInt();

        if (esPrimo(numero)) {
            System.out.println("Es primo.");
        } else {
            System.out.println("No es primo.");
        }
    }

    public static boolean esPrimo(int numero) {
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

}