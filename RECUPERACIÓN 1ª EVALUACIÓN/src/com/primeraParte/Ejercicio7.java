package com.primeraParte;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] tabla = new int[10][10];

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                tabla[i][j] = (int) (Math.random() * (300 - 200 + 1) + 200);
            }
        }

        for (int i = 9; i >= 0; i--) {
            System.out.println();
            for (int j = 0; j < 10; j++) {
                System.out.print(tabla[i][j] + " ");
            }
        }
    }
}