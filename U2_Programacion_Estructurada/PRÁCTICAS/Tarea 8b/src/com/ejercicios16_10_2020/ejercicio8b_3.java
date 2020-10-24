package com.ejercicios16_10_2020;

import java.util.Scanner;

public class ejercicio8b_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, n1, n2, intercambio, i;

        n1 = 0;
        n2 = 1;
        intercambio = 1;

        System.out.println("introduce el Número:");
        num = sc.nextInt();

        for (i=0 ; i<=num ; i++) {
            System.out.print(intercambio + ", ");
            intercambio  = n1+n2;
            n1 = n2;
            n2 = intercambio;
        }
    }
}
