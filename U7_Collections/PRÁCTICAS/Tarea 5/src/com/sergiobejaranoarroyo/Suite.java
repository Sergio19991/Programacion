package com.sergiobejaranoarroyo;

import java.util.Scanner;

public class Suite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcion = "";
        String nombreAspirante = "";
        String dniAspirante = "";
        String telefonoAspirante = "";
        int notaPrueba = 0;
        int aprobados = 0;

        while (!opcion.equals("4")) {
            System.out.println();
            System.out.println("Elige una Opción:");
            System.out.println("1. Introducir datos de aspirantes");
            System.out.println("2. Calificar prueba");
            System.out.println("3. Aprobados");
            System.out.println("4. Salir");
            System.out.print("OPCIÓN: ");
            opcion = sc.nextLine();

            if (opcion.equals("1")) { //Opción 1
                System.out.print("Nombre: ");
                nombreAspirante = sc.nextLine();

                System.out.print("DNI: ");
                dniAspirante = sc.nextLine();

                System.out.print("Teléfono: ");
                telefonoAspirante = sc.nextLine();

                Aspirante aspirante = new Aspirante(nombreAspirante, dniAspirante, telefonoAspirante);
            }

            if (opcion.equals("2")) {
                System.out.print("Nota: ");
                notaPrueba = sc.nextInt();

                aprobados++;
            }

            if (opcion.equals("3")) {
                System.out.println("Hay " + aprobados + " aprobados.");
            }
        }
    }
}