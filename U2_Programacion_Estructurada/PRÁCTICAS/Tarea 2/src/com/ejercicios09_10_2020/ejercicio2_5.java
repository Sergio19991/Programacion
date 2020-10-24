package com.ejercicios09_10_2020;

import java.util.Scanner;

public class ejercicio2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float grados;

        System.out.println("Introduce los ºC:");
        grados = sc.nextFloat();

        System.out.println(grados + "ºC equivalen a " + (9*grados/5+32) + "ºF.");
    }
}
