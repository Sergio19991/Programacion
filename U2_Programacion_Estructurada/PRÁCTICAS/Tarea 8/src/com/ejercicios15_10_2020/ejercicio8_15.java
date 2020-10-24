package com.ejercicios15_10_2020;

import java.util.Scanner;

public class ejercicio8_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, i, j;
        boolean esPrimo;

        System.out.println("Introduce el Número");
        num = sc.nextInt();

        for (i=1 ; i<=num ; i++) {
            esPrimo = true;
            for (j=2 ; j<i ; j++) {
                if (i%j==0) {
                    esPrimo = false;
                    break;
                }
            }
            System.out.println(i+((esPrimo)? "->primo" : "->no primo"));
        }
    }
}
