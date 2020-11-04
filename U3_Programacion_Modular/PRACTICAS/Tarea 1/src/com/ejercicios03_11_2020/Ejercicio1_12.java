package com.ejercicios03_11_2020;

import java.util.Scanner;

public class Ejercicio1_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Introduce un Número:");
        num = sc.nextInt();

        System.out.println(" ");

        System.out.println(num + " no es igual a " + factorial(num));
    }

    public static int factorial(int num) {
        int resto;

        if (num == 0) {
            resto = 1;
        } else {
            resto = num * factorial(num - 1);
        }
        return (resto);
    }

}