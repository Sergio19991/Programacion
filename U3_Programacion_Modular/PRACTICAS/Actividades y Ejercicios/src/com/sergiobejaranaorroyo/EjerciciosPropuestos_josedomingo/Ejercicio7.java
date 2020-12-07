package com.sergiobejaranaorroyo.EjerciciosPropuestos_josedomingo;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vector1 = new int[5];
        int[] vector2 = new int[5];
        int[] vector3 = new int[5];
        int tamanoVector = 5;

        for (int i = 0; i < tamanoVector - 1; i++) {
            System.out.println("Introduce el Elemento " + i + 1 + " del vector1:");
            vector1[i] = sc.nextInt();
        }

        for (int i = 0; i < tamanoVector - 1; i++) {
            System.out.println("Introduce el Elemento " + i + 1 + " del vector2:");
            vector1[i] = sc.nextInt();
        }

        for (int i = 0; i < tamanoVector - 1; i++) {
            vector3[i] = vector1[i] + vector2[i];
        }

        System.out.println("La Suma de los 3 Vectores, es:");

        for (int i = 0; i < tamanoVector - 1; i++) {
            System.out.print(vector3[i] + " ");
        }
    }
}