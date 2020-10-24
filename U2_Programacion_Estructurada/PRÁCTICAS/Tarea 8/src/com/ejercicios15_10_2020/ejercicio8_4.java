package com.ejercicios15_10_2020;

import java.util.Scanner;

public class ejercicio8_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Introduce el Número:");
        num = sc.nextInt();

        for (int i=1 ; i<=num ; i++) {
            System.out.print(" " + i);
        }
    }
}
