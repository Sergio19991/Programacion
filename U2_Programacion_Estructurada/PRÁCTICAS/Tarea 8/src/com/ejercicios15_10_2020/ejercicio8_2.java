package com.ejercicios15_10_2020;

import java.util.Scanner;

public class ejercicio8_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad, suma, num_alumnos, num_adultos;

        suma = 0;
        num_adultos = 0;
        num_alumnos = 0;

        System.out.println("Introduce la Edad del Alumno:");
        edad = sc.nextInt();

        while (edad>0) {
            num_alumnos++;
            suma += edad;
            if (edad>18) {
                num_adultos++;
            }

            System.out.println("Introduce la Edad del Alumno");
            edad = sc.nextInt();
        }

        System.out.println("La Suma es " + suma + ".");
        System.out.println("La Media es " + (suma/num_alumnos) + ".");
        System.out.println("El total de mayores de edad es " + num_adultos + ".");
    }
}
