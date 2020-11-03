package com.ejercicios03_11_2020;

import java.util.Scanner;

public class Ejercicio1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.println("Introduce el Primer Número:");
        num1 = sc.nextInt();
        System.out.println("Introduce el Segundo Número:");
        num2 = sc.nextInt();

        System.out.println();

        System.out.print("El Mayor de " + num1 + " y " + num2 + " es el ");
        System.out.print(mayor2(num1, num2));
        System.out.println(".");

    }

    public static int mayor2(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

}
