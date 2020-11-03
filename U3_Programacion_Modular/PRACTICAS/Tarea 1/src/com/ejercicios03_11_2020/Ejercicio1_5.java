package com.ejercicios03_11_2020;

import java.util.Scanner;

public class Ejercicio1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;

        System.out.println("Introduce el Primer Número:");
        num1 = sc.nextInt();
        System.out.println("Introduce el Segundo Número:");
        num2 = sc.nextInt();
        System.out.println("Introduce el Segundo Número:");
        num3 = sc.nextInt();

        System.out.println();


        System.out.print("El Mayor de " + num1 + ", " + num2 + " y " + num3 + " es el ");
        System.out.print(mayor3(num1, num2, num3));
        System.out.println(".");
    }

    public static int mayor2(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }


    public static int mayor3(int num1, int num2, int num3) {
        if (mayor2(num1, num2) > num3) {
            return mayor2(num1, num2);
        } else {
            return num3;
        }
    }

}