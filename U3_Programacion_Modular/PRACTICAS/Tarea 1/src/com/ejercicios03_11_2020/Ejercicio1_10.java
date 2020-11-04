package com.ejercicios03_11_2020;

import java.util.Scanner;

public class Ejercicio1_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.println("Introduce el Primer Número:");
        num1 = sc.nextInt();
        System.out.println("Introduce el Segundo Número:");
        num2 = sc.nextInt();

        if (amigos(num1, num2)) {
            System.out.println(num1 + " y " + num2 + " son amigos.");
        } else {
            System.out.println("No son amigos.");
        }
    }

    public static boolean amigos(int num1, int num2) {
        boolean amigos;

        if (num1 == sumaDivisoresPropios(num2) && num2 == sumaDivisoresPropios(num1)) {
            amigos = true;
        } else {
            amigos = false;
        }
        return amigos;
    }

    public static int sumaDivisoresPropios(int num) {
        int suma = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                suma += i;
            }
        }
        return (suma);
    }

}