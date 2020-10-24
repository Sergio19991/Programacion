package com.ejercicios15_10_2020;

import java.util.Scanner;

public class ejercicio4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1, n2, n3;

        System.out.println("Introduce el Primer Número:");
        n1 = sc.nextFloat();
        System.out.println("Introduce el Segundo Número:");
        n2 = sc.nextFloat();
        System.out.println("Introduce el Segundo Número:");
        n3 = sc.nextFloat();

        System.out.println("La media es: " + (int)(n1+n2+n3)/3);
    }
}
