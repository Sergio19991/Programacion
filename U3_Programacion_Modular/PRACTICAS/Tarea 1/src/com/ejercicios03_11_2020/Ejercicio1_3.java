package com.ejercicios03_11_2020;

import java.util.Scanner;

public class Ejercicio1_3 {
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

        cilindro(opcion, radio, altura);   //Llamada a la Función "cilindro();".
    }

    public static double cilindro(int opcion, double radio, double altura) {
        if (opcion == 1) {   //Calcula el Área del Cilindro.
            System.out.println("El Área es " + (2 * Math.PI * radio * (altura + radio)) + ".");
            return 2 * Math.PI * radio * (altura + radio);
        } else if (opcion == 2) {   //Calcula el Volumen del Cilindro.
            System.out.println("El Volumen es " + (Math.PI * radio * radio * altura) + ".");
            return Math.PI * radio * radio * altura;
        } else {   //No se ha especificado una opción válida (ni 1 ni 2).
            System.out.println("Esta opción no es válida.");
            return 0;
        }
    }

}