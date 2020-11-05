package com.sergiobejaranoarroyo;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, posicion_inicio, posicion_final;

        do {
            System.out.println("Introduce un Número Positivo:");
            num = sc.nextInt();
        } while (num < 0);

        System.out.println("Introduce una Posición de Inicio:");
        posicion_inicio = sc.nextInt();
        System.out.println("Introduce una Posición Final:");
        posicion_final = sc.nextInt();

        for (int i = 0; i <= posicion_inicio; i++) {
            if (posicion_inicio == i) {
                System.out.println("Posicion inicial: " + (num - i));
            }
            for (int j = 0; j <= posicion_final; j++) {
                if (posicion_final == j) {
                    System.out.println("Posición final: " + (num - j));
                }
            }
        }
    }
}