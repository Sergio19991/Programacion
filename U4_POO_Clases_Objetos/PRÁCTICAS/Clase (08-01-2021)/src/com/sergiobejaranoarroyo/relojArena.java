package com.sergiobejaranoarroyo;

import java.util.Scanner;

public class relojArena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamano;

        System.out.println("Introduce el Tamaño de la Pirámide:");
        tamano = sc.nextInt();

        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                if (i < tamano / 2 + 1) {
                    if (j >= i && j <= tamano - 1 - i) {
                        System.out.print("*");
                    } else {
                        System.out.print("-");
                    }
                } else {
                    if (j >= tamano - 1 - i && j <= i) {
                        System.out.print("*");
                    } else {
                        System.out.print("-");
                    }
                }
            }

            System.out.println();
        }
    }
}