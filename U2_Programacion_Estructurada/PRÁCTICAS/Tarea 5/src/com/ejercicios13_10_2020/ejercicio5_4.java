package com.ejercicios13_10_2020;

import java.util.Scanner;

public class ejercicio5_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, numpares;

        numpares = 0;

        System.out.println("Introduce el Primer Número:");
        num1 = sc.nextInt();
        System.out.println("Introduce en Segundo Número:");
        num2 = sc.nextInt();

        if (num1%2==0) {
            numpares++;
        }
        if (num2%2==0){
            numpares++;
        }

        System.out.println("Hay " + numpares + " pares.");
    }
}
