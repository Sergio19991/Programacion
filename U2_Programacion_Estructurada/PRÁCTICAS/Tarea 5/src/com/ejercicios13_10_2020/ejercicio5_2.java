package com.ejercicios13_10_2020;

import java.util.Scanner;

public class ejercicio5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Introduce el número 12:");
        num = sc.nextInt();

        if (num==12) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
}
