package com.entregable_1920;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura, fila, columna;

        System.out.println("Introduce la Altura:");
        altura = sc.nextInt();

        while (altura % 2 == 0 || altura < 3) {
            System.out.println("Debe ser Impar y Mayor o Igual que 3.");
            System.out.println("Introduce la Altura:");
            altura = sc.nextInt();
        }

        for (fila = 0; fila < altura; fila++) {
            for (columna = 0; columna < altura; columna++) {
                if (fila + columna == altura / 2 || fila - columna == altura / 2) {
                    System.out.print("*      *");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}