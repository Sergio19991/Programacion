package com.ejercicios16_10_2020;

import java.util.Scanner;

public class ejercicio8b_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura, i;

        System.out.println("Introduce la Altura de la U:");
        altura = sc.nextInt();

        for (i=0 ; i<altura ; i++) {
            if (i==altura-1) {
                System.out.println(" **** ");
            } else {
                System.out.println("*    *");
            }
        }
    }
}
