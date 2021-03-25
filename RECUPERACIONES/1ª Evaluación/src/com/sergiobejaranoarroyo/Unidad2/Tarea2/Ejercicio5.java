package com.sergiobejaranoarroyo.Unidad2.Tarea2;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double gradosFahrenheit;

        System.out.print("Introduce los Grados: ");
        double gradosCentigrados = sc.nextInt();
        System.out.println();

        gradosFahrenheit = ((9 * gradosCentigrados) / 5) + 32;
        System.out.println(gradosFahrenheit);

    }
}