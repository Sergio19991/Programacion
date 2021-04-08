package com.sergiobejaranoarroyo.Unidad2.Tarea6;

import java.util.Optional;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        double radio, diametro, perimetro, area;

        System.out.print("Introduce el Radio: ");
        radio = sc.nextDouble();
        System.out.println();

        System.out.println("Elige una Opción: ");
        System.out.println("   1. Calcular Diámetro.");
        System.out.println("   2. Calcular Perímetro.");
        System.out.println("   3. Calcular Área.");
        System.out.print("OPCIÓN: ");
        opcion = sc.nextInt();
        System.out.println();

        switch (opcion) {
            case 1:
                diametro = (2 * radio);
                System.out.println("Diámetro: " + diametro);
                break;
            case 2:
                perimetro = (2 * Math.PI * radio);
                System.out.println("Perímetro: " + perimetro);
                break;
            case 3:
                area = (Math.PI * Math.pow(radio, 2));
                System.out.println("Área: " + area);
                break;
            default:
                System.out.println(opcion + "no es una Opción Válida.");
        }
    }
}