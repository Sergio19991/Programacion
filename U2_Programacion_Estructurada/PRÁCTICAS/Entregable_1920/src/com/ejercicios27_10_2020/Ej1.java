package com.ejercicios27_10_2020;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2, n3;
        double media;
        String recup;

        System.out.println("Introduce la Nota del Primer Control:");
        n1 = sc.nextDouble();
        System.out.println("introduce la Nota del Segundo Control:");
        n2 = sc.nextDouble();
        System.out.println("Introduce la Nota del Tercer Control:");
        n3 = sc.nextDouble();

        media = (n1 + n1 + n3) / 3;
        System.out.println(media);

        if (media >= 5) {
            if (media >= 5 && media < 6) {
                System.out.println("Tu nota de Programación es " + media + " - Suficiente");
            } else if (media >= 6 && media < 7) {
                System.out.println("Tu nota de Programación es " + media + " - Bien");
            } else if (media >= 7 && media < 9) {
                System.out.println("Tu nota de Programación es " + media + " - Notable");
            } else {
                System.out.println("Tu nota de Programación es " + media + " - Sobresaliente");
            }
        } else {
            System.out.println("Introduce la Nota de Recuperación:");
            sc.nextLine();
            recup = sc.nextLine();
            if (recup.equals("apto")) {
                System.out.println("Tu nota de recuperación es 5 - Suficiente");
            } else {
                System.out.println("Tu nota de Programación es " + media + " - Suspenso");
            }
        }
    }
}
