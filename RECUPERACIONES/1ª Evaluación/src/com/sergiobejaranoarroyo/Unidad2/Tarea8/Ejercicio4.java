package com.sergiobejaranoarroyo.Unidad2.Tarea8;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Introduce un Número: ");
        n = sc.nextInt();

        System.out.println();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}