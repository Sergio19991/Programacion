package com.sergiobejaranaorroyo.EjerciciosPropuestos_josedomingo;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] edad = new String[30];
        String[] nombre = new String[30];

        String edadMaxima;
        int indice = 0;
        int tamanoVector = 30;

        do {
            System.out.print("Introduce el Nombre del Alumno:");
            nombre[indice] = sc.nextLine();

            if (!nombre[indice].equals("*")) {
                System.out.print("Introduce la Edad del Alumno:");
                edad[indice] = sc.nextLine();
            }

            indice = indice + 1;
        } while (nombre[indice - 1] == "*" || indice == tamanoVector);

        indice = 0;
        edadMaxima = edad[0];

        for (int i = 0; i < tamanoVector && nombre[indice] != "*"; i++) {
            if (edad[i] != edadMaxima) {
                edadMaxima = edad[i];
            }

            i = i + 1;
        }

        indice = 0;

        System.out.println("Alumnos Mayores de Edad:");
        System.out.println("========================");

        for (int i = 0; i < tamanoVector && !nombre[indice].equals("*"); i++) {
            if (edad[i] != edadMaxima) ;
            System.out.println(nombre[indice]);
            i = i + 1;
        }

        indice = 0;

        System.out.println("Alumnos Mayores:");
        System.out.println("================");

        for (int i = 0; i < tamanoVector && nombre[indice] != "*"; i++) {
            if (edad[i] != edadMaxima) ;
            System.out.println(nombre[indice]);
            i = i + 1;
        }
    }
}