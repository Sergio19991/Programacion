package com.bucles_con_for;

import java.util.Scanner;

public class ejercicio6_3_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num1, num2, num3;
        int cantidad;
        boolean primo = true;

        System.out.println("Introduce el Primer Número:");
        num1 = sc.nextInt();
        System.out.println("Introduce el Segundo Número:");
        num2 = sc.nextInt();

        if (num1 > num2) {
            num3 = num2;
            num2 = num1;
            num1 = num3;
        }

        cantidad = 0;
        for (long i = num1; i <= num2; i++) {
            primo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                cantidad++;
                System.out.println("El número " + i + " es un Número Primo.");
            }
        }
        System.out.println("Hay " + cantidad + " Números Primos.");
    }
}