package com.bucles_con_for;

import java.util.Scanner;

public class ejercicio6_3_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num;

        System.out.println("Introduce el Número:");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println("El número " + i + " es divisor de " + num + ".");
            }
        }
    }
}