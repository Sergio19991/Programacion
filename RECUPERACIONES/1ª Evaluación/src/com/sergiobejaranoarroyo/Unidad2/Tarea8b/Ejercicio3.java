package com.sergiobejaranoarroyo.Unidad2.Tarea8b;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int intercambio = 1;
        int fibonacci1 = 0;
        int fibonacci2 = 1;

        System.out.print("Introduce un Número: ");
        n = sc.nextInt();

        System.out.print("0, ");
        for (int i = 0; i <= n; i++) {
            System.out.print(intercambio + ", ");

            intercambio = fibonacci1 + fibonacci2;
            fibonacci1 = fibonacci2;
            fibonacci2 = intercambio;
        }
    }
}