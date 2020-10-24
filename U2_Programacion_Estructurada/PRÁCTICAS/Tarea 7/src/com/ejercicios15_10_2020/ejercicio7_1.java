package com.ejercicios15_10_2020;

import java.util.Scanner;

public class ejercicio7_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, aux;

        a = 5;
        b = 10;

        aux = a;
        a = b;
        b = aux;

        System.out.println("El valor de a es " + a);
        System.out.println("El valor de b es " + b);
    }
}
