package com.sergiobejaranoarroyo.Ejercicio7_1;

import com.sergiobejaranoarroyo.Conjunto;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcion;

        Persona p1 = new Persona("Pepe", "Pérez", "2222222x");
        Persona p2 = new Persona("Rosa", "Pez", "2222222x");

        Frontera f = new Frontera();

        f.addPersona(p1);
        f.addPersona(p2);

        System.out.println(f);

        do {
            mostrarMenu();
            System.out.println("Introduce una Opción:");
            opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    f.pasoFrontera();
                    break;
                case "2":
                    System.out.println(f);
                    break;
                case "3":
                    System.out.println("Introduce el Nombre a buscar:");
                    String nombre = sc.nextLine();
                    System.out.println(f.busquedaPersonaNombre(nombre));
                    break;
                case "4":
                    System.out.println("Introduce el DNI a buscar:");
                    String dni = sc.nextLine();
                    System.out.println(f.busquedaPersonaDNI(dni));
                    break;
                case "5":
                    System.out.println("ADIÓS");
                    break;
                default:
                    System.out.println("Opción incorrecta.");
            }
        } while (!opcion.equals(5));
    }

    public static void mostrarMenu() {
        System.out.println("1. Paso de frontera.");
        System.out.println("2. Mostrar todas las personas.");
        System.out.println("3. Búsqueda por nombre");
        System.out.println("4. Búsqueda por DNI.");
        System.out.println("5. Salir.");
    }
}