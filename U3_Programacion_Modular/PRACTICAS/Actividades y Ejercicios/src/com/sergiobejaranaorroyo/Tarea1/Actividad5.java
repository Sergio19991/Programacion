package com.sergiobejaranaorroyo.Tarea1;

import java.util.Scanner;

public class Actividad5 {
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
        return Math.max(num1, num2);
    }

    public static int mayor3(int num1, int num2, int num3) {
        return Math.max(mayor2(num1, num2), num3);
    }

}