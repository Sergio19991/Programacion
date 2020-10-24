package com.ejercicios09_10_2020;

import java.util.Scanner;

public class ejercicio3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float millas;

        System.out.println("Introduce la cantidad de Millas:");
        millas = sc.nextFloat();

        System.out.println(millas + " Millas equivalen a " + (millas*1.609) + " Km.");
    }
}
