package com.sergiobejaranoarroyo.Unidad2.Entregable1920;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura, cantidadEspacios;

        System.out.print("Introduce la Altura: ");
        altura = sc.nextInt();
        System.out.println();

        cantidadEspacios = (altura - 1) / 2;

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < cantidadEspacios; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < altura - 2 * cantidadEspacios; j++) {
                System.out.print("SAMPLE");
            }

            System.out.println();

            if (i < altura / 2) {
                cantidadEspacios--;
            } else {
                cantidadEspacios++;
            }
        }
    }
}