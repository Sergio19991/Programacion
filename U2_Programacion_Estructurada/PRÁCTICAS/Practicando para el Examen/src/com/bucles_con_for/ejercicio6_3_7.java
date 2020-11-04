package com.bucles_con_for;

import java.util.Scanner;

public class ejercicio6_3_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamano;

        System.out.println("Introduce el Tamaño:");
        tamano = sc.nextInt();

        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                if (i == 0 || i == tamano - 1 || j == 0 || j == tamano - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}