package com.sergiobejaranoarroyo.Unidad2.Tarea8b;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura;

        System.out.print("Introduce la Altura de la U: ");
        altura = sc.nextInt();
        System.out.println();

        for (int i = 0; i < altura; i++) {
            if (i == altura - 1) {
                System.out.println(" * * * * ");
            } else {
                System.out.println("*       *");
            }
        }
    }
}