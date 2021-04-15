package com.sergiobejaranoarroyo.Unidad2.Tarea8b;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int n1 = 0;
        int n2 = 1;
        int intercambio = 1;

        System.out.print("Introduce un Número: ");
        n = sc.nextInt();
        System.out.println();

        System.out.print("0, ");
        for (int i = 0; i <= n; i++) {
            System.out.print(intercambio + ", ");
            intercambio = n1 + n2;
            n1 = n2;
            n2 = intercambio;
        }
    }
}