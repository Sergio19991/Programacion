package com.ejercicios13_10_2020;

import java.util.Scanner;

public class ejercicio5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Introduce un número:");
        num = sc.nextInt();

        if (num%2==0) {
            System.out.println("Este número es PAR.");
        } else {
            System.out.println("Este número es IMPAR.");
        }
    }
}
