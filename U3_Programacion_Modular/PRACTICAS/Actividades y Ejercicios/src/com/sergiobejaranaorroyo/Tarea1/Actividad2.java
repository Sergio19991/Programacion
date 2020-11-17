package com.sergiobejaranaorroyo.Tarea1;

import java.util.Scanner;

public class Actividad2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.println("Entroduce el Primer Número:");
        num1 = sc.nextInt();
        System.out.println("Introduce el Segundo Número:");
        num2 = sc.nextInt();

        System.out.println();

        numerosComprendidos(num1, num2);
    }

    public static void numerosComprendidos(int num1, int num2) {
        for (int i = num1; i <= num2; i++) {
            System.out.println(i);
        }
    }

}