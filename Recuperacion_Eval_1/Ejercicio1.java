package com.sergiobejaranoarroyo;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, digitos = 0;

        do {
            System.out.println("Introduce el número:");
            num = sc.nextInt();
        } while ((num > 99999) || (num < -99999));

        for (int i = 0; i <= num; i++) {
            digitos++;
        }

        System.out.println("El número cierto " + num + " tiene " + (digitos - num) + " dígitos");
    }
}