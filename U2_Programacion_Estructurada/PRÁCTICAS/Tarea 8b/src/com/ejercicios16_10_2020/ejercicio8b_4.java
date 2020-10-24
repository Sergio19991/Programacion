package com.ejercicios16_10_2020;

import java.util.Scanner;

public class ejercicio8b_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, i, positivos, negativos;

        positivos = 0;
        negativos = 0;

        for (i=1 ; i<=10 ; i++) {
            System.out.println("Introduce el Número:");
            num = sc.nextInt();
            if (num<0) {
                negativos++;
            }
            if (num>0) {
                positivos++;
            }
        }

        System.out.println("Hay " + positivos + " Positivos.");
        System.out.println("Hay " + negativos + " Negativos.");
    }
}
