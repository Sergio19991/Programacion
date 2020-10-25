package com.ejercicios23_10_2020;

import java.util.Scanner;

public class ejercicio9_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra1, palabra2;

        System.out.println("Introduce la Primera Palabra");
        palabra1 = sc.nextLine();
        System.out.println("Introduce la Seguna Palabra");
        palabra2 = sc.nextLine();

        if (palabra1.equals(palabra2)) {
            System.out.println("La Primera Palabra es menor.");
        } else {
            System.out.println("La Segunda Palabra es menor.");
        }
    }
}
