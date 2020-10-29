package com.ejercicios27_10_2020;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamano, fila, columna;

        System.out.println("Introduce la Altura");
        tamano = sc.nextInt();

        while (tamano % 2 == 0 || tamano < 3) {
            System.out.println("Debe ser Impar y Mayor o Igual que 3");
            System.out.println("Introduce la Altura");
            tamano = sc.nextInt();
        }

        for (fila = 0; fila < tamano; fila++) {
            for (columna = 0; columna < tamano; columna++) {
                if (fila + columna == tamano / 2 || fila - columna == tamano / 2) {
                    System.out.print("*     *");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
