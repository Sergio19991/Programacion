package com.sergiobejaranoarroyo.Unidad2.Tarea6;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radio, opcion;

        System.out.print("Introduce el Valor del Radio de una Circunferencia: ");
        radio = sc.nextInt();

        System.out.println();
        System.out.println("Elige una opcion:");
        System.out.println("1. Calcular el diáemtro.");
        System.out.println("2. Calcular el Perímetro.");
        System.out.println("3. Calcular el Área.");
        System.out.print("OPCIÓN: ");
        opcion = sc.nextInt();
        System.out.println();

        if (opcion == 1) {
            double diametro = (double) (2 * radio);
            System.out.println("Diámetro: " + diametro);
        } else if (opcion == 2) {
            double perimetro = (double) (2 * Math.PI * radio);
            System.out.println("Perímetro: " + perimetro);
        } else if (opcion == 3) {
            double area = (double) (Math.PI * radio * radio);
            System.out.println("Área: " + area);
        }
    }
}