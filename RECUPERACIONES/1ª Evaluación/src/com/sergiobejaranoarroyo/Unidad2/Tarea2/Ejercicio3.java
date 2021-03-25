package com.sergiobejaranoarroyo.Unidad2.Tarea2;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dividendo;
        double divisor;

        System.out.print("Introduce el Dividendo: ");
        dividendo = sc.nextDouble();
        System.out.print("Introduce el Divisor: ");
        divisor = sc.nextDouble();

        System.out.println();
        double resultado = dividendo / divisor;

        System.out.println(resultado);
    }
}