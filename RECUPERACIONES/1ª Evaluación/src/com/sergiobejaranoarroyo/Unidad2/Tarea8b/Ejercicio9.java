package com.sergiobejaranoarroyo.Unidad2.Tarea8b;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura;

        System.out.print("Introduce la Altura: ");
        altura = sc.nextInt();

        System.out.println();

        for (int i = 1; i < altura; i++) {
            System.out.println("*");
        }

        for (int i = 1; i <= (altura / 2) + 1; i++) {
            System.out.print("* ");
        }
    }
}