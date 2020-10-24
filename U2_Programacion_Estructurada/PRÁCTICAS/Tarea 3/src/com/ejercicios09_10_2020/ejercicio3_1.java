package com.ejercicios09_10_2020;

import java.util.Scanner;

public class ejercicio3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte num1, num2;

        System.out.println("Introduce el Primer Número:");
        num1 = sc.nextByte();
        System.out.println("Introduce el Segundo Número:");
        num2 = sc.nextByte();

        System.out.println("El resultado de Sumar " + num1 + " más " + num2 + " es igual a " + (num1+num2) + ".");
    }
}
