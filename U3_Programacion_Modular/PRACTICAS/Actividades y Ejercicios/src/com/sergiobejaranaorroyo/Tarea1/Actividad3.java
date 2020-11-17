package com.sergiobejaranaorroyo.Tarea1;

import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        double radio, altura;

        System.out.println("Introduce el Radio del Cilindro:");
        radio = sc.nextInt();
        System.out.println("Introduce la Altura del Cilindro:");
        altura = sc.nextInt();

        System.out.println();

        System.out.println("Introduce una de las dos Opciones siguientes:");
        System.out.println("     1   -->   Calcular el Área del Cilindro.");
        System.out.println("     2   -->   Calcular el Volumen del Cilindro.");
        System.out.print("Elija una opción: ");
        opcion = sc.nextInt();

        System.out.println();

        cilindro(opcion, radio, altura);
    }

    public static void cilindro(int opcion, double radio, double altura) {
        if (opcion == 1) {
            System.out.println("El Área es " + (2 * Math.PI * radio * (altura + radio)) + ".");
        } else if (opcion == 2) {
            System.out.println("El Volumen es " + (Math.PI * radio * radio * altura) + ".");
        } else {
            System.out.println("Esta opción no es válida.");
        }
    }

}