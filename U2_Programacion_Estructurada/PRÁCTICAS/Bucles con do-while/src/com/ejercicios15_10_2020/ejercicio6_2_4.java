package com.ejercicios15_10_2020;

import java.util.Scanner;

public class ejercicio6_2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        do {
            System.out.println("Introduce el Primer Número:");
            num1 = sc.nextInt();
            System.out.println("Introduce el Segundo Número");
            num2 = sc.nextInt();
            System.out.println("El resultado de " + num1 + "+" + num2 + " = " + (num1+num2));
        } while ((num1!=0) && (num2!=0));
    }
}
