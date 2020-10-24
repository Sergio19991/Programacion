package com.ejercicios15_10_2020;

import java.util.Scanner;

public class ejercicio4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;

        System.out.println("Introduce el Primer Número:");
        n1 = sc.nextInt();
        System.out.println("Introduce el Segundo Número:");
        n2 = sc.nextInt();

        System.out.println("La media es: " + (float)(n1+n2)/2);
    }
}
