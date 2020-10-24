package com.ejercicios13_10_2020;

import java.util.Scanner;

public class ejercicio5_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num1, num2, num3;   //long sirve para los número enteros largos

        System.out.println("Introduce el Primer Número:");
        num1 = sc.nextLong();
        System.out.println("Introduce el Segundo Número:");
        num2 = sc.nextLong();
        System.out.println("Introduce el Tercer Número:");
        num3 = sc.nextLong();

        if (num1>num2) {
            System.out.println(num1 + " es el mayor.");
        } else if (num2>num3) {
            System.out.println(num2 + " es el mayor.");
        } else {
            System.out.println(num3 + " es el mayor.");
        }
    }
}
