package com.sergiobejaranoarroyo.Unidad2.Tarea8;

import java.util.Scanner;

public class Actividad2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidadAlumnos = -1, sumaEdades = 1, cantidadMayoresEdad = 0, edad;
        double media;

        do {
            System.out.print("Introduce la Edad del Alumno: ");
            edad = sc.nextInt();
            System.out.println();

            cantidadAlumnos++;

            sumaEdades += edad;

            if (edad >= 18) {
                cantidadMayoresEdad++;
            }
        } while (edad > 0);

        System.out.println();

        media = (sumaEdades / cantidadAlumnos);

        System.out.println("Suma de las edades: " + sumaEdades);
        System.out.println("Media del total de edades introducidas: " + media);
        System.out.println("Cantidad de Mayores de Edad: " + cantidadMayoresEdad);
    }
}