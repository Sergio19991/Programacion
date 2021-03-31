package com.sergiobejaranoarroyo.Unidad2.Tarea8b;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int combinacionUsuario, combinacionCajaFuerte = 1234;

        for (int i = 0; i < 4; i++) {
            System.out.print("Introduce la Combinación de la Caja Fuerte: ");
            combinacionUsuario = sc.nextInt();

            if (combinacionUsuario != combinacionCajaFuerte) {
                System.out.println("Lo siento, esa no es la combinacion");
                System.out.println();
            } else if (combinacionUsuario == combinacionCajaFuerte) {
                System.out.println();
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
                break;
            }
        }
    }
}