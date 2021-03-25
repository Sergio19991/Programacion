package com.sergiobejaranoarroyo.Unidad2.Tarea3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el Dividendo: ");
        double dividendo = sc.nextDouble();
        System.out.print("Introduce el Divisor: ");
        double divisor = sc.nextDouble();
        System.out.println();

        double resultado = (dividendo / divisor);

        System.out.println(resultado);
    }
}