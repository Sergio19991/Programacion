package com.ejercicios15_10_2020;

import java.util.Scanner;

public class ejercicio6_1_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, cantidad;

        System.out.println("Introduce el número de *:");
        num = sc.nextInt();

        cantidad=0;

        while (cantidad<=num) {
            System.out.print(" * ");
            cantidad++;
        }
    }
}
