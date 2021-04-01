package com.sergiobejaranoarroyo.Unidad2.Tarea8b;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura;

        System.out.print("Introduce la Altura de la L: ");
        altura = sc.nextInt();
        System.out.println();

        for (int i = 0; i < altura; i++) {
            if (i < altura - 1) {
                System.out.println("*");
            } else {
                for (int j = 0; j < (altura / 2) + 1; j++) {
                    System.out.print("* ");
                }
            }
        }
    }
}