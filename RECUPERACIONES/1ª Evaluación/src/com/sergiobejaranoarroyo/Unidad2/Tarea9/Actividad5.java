package com.sergiobejaranoarroyo.Unidad2.Tarea9;

import java.util.Scanner;

public class Actividad5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase, comienzo = "Javalín javalón", terminaciones = "javalén, len, len";

        System.out.print("Introduce la Frase: ");
        frase = sc.nextLine();

        System.out.println();

        if (frase.length() > comienzo.length()) {
            String c1 = frase.substring(0, comienzo.length());
            String c2 = frase.substring(frase.length() - terminaciones.length(), frase.length());

            if (frase.substring(0, comienzo.length()).equals(comienzo)) {
                String resultado1 = frase.substring(comienzo.length());
                System.out.println("El Mensaje real, es " + resultado1);
            } else if (frase.substring(frase.length() - terminaciones.length(), frase.length()).equals(terminaciones)) {
                String resultado2 = frase.substring(0, frase.length() - 1 - terminaciones.length()).trim();
                System.out.println("El Mensaje real, es " + resultado2);
            } else {
                System.out.println("Esta frase no es del idioma correcto.");
            }
        } else {
            System.out.println("Esta frase no es del idioma correcto.");
        }
    }
}