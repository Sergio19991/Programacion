package com.ejercicios27_10_2020;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float primer_control, segundo_control, media;
        String apto = "apto", no_apto = "no apto", recuperacion;

        System.out.println("Introduce la Nota del Primer Control:");
        primer_control = sc.nextInt();
        System.out.println("Introduce la Nota del Segundo Control:");
        segundo_control = sc.nextInt();

        media = (primer_control + segundo_control) / 2;

        if (media >=5 && media < 6) {
            System.out.println("Tu nota de Programación es " + media + " - Suficiente");
        } else if (media >= 6 && media < 7) {
            System.out.println("Tu nota de Programación es " + media + " - Bien");
        } else if (media >= 7 && media < 9) {
            System.out.println("Tu nota de Programación es " + media + " - Notable");
        } else if (media<5) {
            System.out.println("¿Cuál ha sido el resultado de la recuperación? (apto/no apto:)");
            recuperacion = sc.nextLine();
            if (recuperacion.equals(apto)) {
                System.out.println("Tu nota de Programación es " + 5 + " - Suficiente");
            } else {
                System.out.println("Tu nota de Programación es " + media + " - Suspenso");
            }
        } else {
            System.out.println("Tu nota de Programación es " + media + " - Sobresaliente");
        }
    }
}
