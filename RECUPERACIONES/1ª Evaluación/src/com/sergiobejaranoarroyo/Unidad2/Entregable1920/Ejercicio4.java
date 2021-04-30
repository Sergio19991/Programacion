package com.sergiobejaranoarroyo.Unidad2.Entregable1920;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura;

        System.out.print("Introduce la altura de la flecha: ");
        altura = sc.nextInt();

        System.out.println();

        while ((altura % 2 == 0) || (altura < 3)) {
            System.out.println("Debe ser Impar y Mayor o Igual que 3.");
            System.out.print("Introduce la altura de la flecha: ");
            altura = sc.nextInt();
        }

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                if ((i + j == altura / 2) || (i - j == altura / 2)) {
                    System.out.print("*     *");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}