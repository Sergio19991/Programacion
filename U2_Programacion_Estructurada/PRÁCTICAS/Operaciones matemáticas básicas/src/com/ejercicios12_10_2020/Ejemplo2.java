package com.ejercicios12_10_2020;

import java.util.Scanner;

public class Ejemplo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;

        System.out.println("Introduzca su edad:");
        edad = sc.nextInt();

        if (edad<18) {
            System.out.println("Es menor de Edad.");
        } else if (edad<65) {
            System.out.println("Trabajador.");
        } else if (edad<100) {
            System.out.println("Jubilado");
        } else {
            System.out.println("Eterno");
        }
    }
}
