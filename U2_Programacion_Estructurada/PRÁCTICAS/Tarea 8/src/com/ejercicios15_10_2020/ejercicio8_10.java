package com.ejercicios15_10_2020;

import java.util.Scanner;

public class ejercicio8_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, i;

        System.out.println("Introduce un número entre el 1 y 10:");
        num = sc.nextInt();

        for (i=1 ; i<=10 ; i++) {
            if (num>1 && num<10) {
                System.out.println(num + " X " + i + " = " + (num*i));
            }
        }
    }
}
