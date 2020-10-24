package com.ejercicios09_10_2020;

import java.util.Scanner;

public class ejercicio3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dividendo, divisor;   //double quiere decir que es de doble precisión

        System.out.println("introduce el Dividendo:");
        dividendo = sc.nextDouble();
        System.out.println("Introduce el Divisor:");
        divisor = sc.nextDouble();

        System.out.println(dividendo + " entre " + divisor + " es igual a " + (dividendo/divisor + "."));
    }
}
