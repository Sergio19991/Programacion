package com.sbejarano;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Float a, b;

        System.out.println("Introduce el Primer Número:");
        a = sc.nextFloat();
        System.out.println("Introduce el Segundo Número:");
        b = sc.nextFloat();

        System.out.println("La Suma es " + (a+b));
        System.out.println("La Resta es " + (a-b));
        System.out.println("La Multiplicación es " + (a*b));
        System.out.println("La Divisón de " + (a/b));
        System.out.println("La Módulo (resto) de " + (a%b));
    }
}
