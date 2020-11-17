package com.sergiobejaranaorroyo.Tarea1;

import java.util.Scanner;

public class Actividad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Introduce el número de veces:");
        n = sc.nextInt();

        eco(n);
    }

    public static void eco(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Eco...");
        }
    }

}