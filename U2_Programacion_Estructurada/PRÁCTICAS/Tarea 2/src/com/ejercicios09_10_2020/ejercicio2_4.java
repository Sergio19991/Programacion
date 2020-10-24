package com.ejercicios09_10_2020;

import java.util.Scanner;

public class ejercicio2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num;

        System.out.println("Introduce la cantidad de Millas:");
        num = sc.nextFloat();

        System.out.println(num + " millas son " + (num*1609) + " metros.");
    }
}
