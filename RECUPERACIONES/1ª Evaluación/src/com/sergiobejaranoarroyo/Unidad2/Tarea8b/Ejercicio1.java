package com.sergiobejaranoarroyo.Unidad2.Tarea8b;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int combinacionUsuario;
        final int combinacionCajaFuerte = 1234;
        final int intentos = 4;

        System.out.print("Introduce la combinación: ");
        combinacionUsuario = sc.nextInt();

        for (int i = 0; i < 3; i++) {
            if (combinacionUsuario != combinacionCajaFuerte) {
                System.out.println("Lo siento, esa no es la combinación" + "\n");
                System.out.print("Introduce la combinación: ");
                combinacionUsuario = sc.nextInt();
                System.out.println();
                combinacionUsuario = sc.nextInt();
            } else {
                System.out.println("   ¡¡¡   CAJA ABIERTA   !!!   ");
                break;
            }
        }
    }
}