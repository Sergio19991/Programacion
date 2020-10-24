package com.ejercicios15_10_2020;

import java.util.Scanner;

public class ejercicio8_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        boolean haySuspensos = false;

        for (int i=1 ; i<5 ; i++) {
            System.out.println("Introduce la nota:");
            num = sc.nextInt();

            if (num<5) {
                haySuspensos = true;
            }
            if (haySuspensos) {
                System.out.println("Hay algún suspenso.");
                break;
            }
        }
    }
}

