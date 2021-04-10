package com.sergiobejaranoarroyo.Unidad2.Tarea8;

import java.util.Scanner;

public class Actividad14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Introduce la Altura: ");
        n = sc.nextInt();
        System.out.println();

        for (int i = 1; i <= n; i++) {
            System.out.println(" *");
        }
    }
}