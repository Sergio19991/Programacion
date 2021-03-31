package com.sergiobejaranoarroyo.Unidad2.Tarea8;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;
        int cantidadAlumnos = -1, cantidadAdutos = 0, sumaEdades = 0;

        System.out.println("Introduce una edad negativa para salir.");

        do {
            System.out.print("Introduce la Edad del Alumno: ");
            edad = sc.nextInt();

            cantidadAlumnos++;

            sumaEdades += edad;

            if (edad >= 18) {
                cantidadAdutos++;
            }
        } while (edad != -1);

        System.out.println();
        System.out.println("Mayores de Edad: " + cantidadAdutos);
        System.out.println("Total de Alumnos: " + cantidadAlumnos);
        System.out.println("Media de las Edades: " + (sumaEdades / cantidadAlumnos));
    }
}