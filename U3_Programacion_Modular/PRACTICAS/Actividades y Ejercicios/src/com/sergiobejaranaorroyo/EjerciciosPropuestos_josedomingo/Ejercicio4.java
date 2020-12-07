package com.sergiobejaranaorroyo.EjerciciosPropuestos_josedomingo;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[10];
        int tamanoVector = 10, indice = 0, num;

        do {
            System.out.print("Introduce un Número en el Vector. Número " + indice + 1);
            vector[indice] = sc.nextInt();
            indice = indice + 1;
        } while (indice == tamanoVector || vector[indice - 1] < 0);

        System.out.println("Elementos del Vector:");

        for (int i = 0; i < tamanoVector - 1 && vector[i] >= 0; i++) {
            System.out.print(vector[i]);
            i = i + 1;
        }
    }
}