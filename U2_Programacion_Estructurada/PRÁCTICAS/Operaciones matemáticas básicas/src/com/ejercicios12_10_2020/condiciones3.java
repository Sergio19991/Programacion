package com.ejercicios12_10_2020;

import java.util.Scanner;

public class condiciones3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Introduce el Número");
        num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Es PAR");
        } else {
            System.out.println("Es IMPAR");
        }
    }
}
