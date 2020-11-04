package com.entregable_1920;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, nota3;
        double media;
        String recuperacion;

        System.out.println("Introduce la Nota del Primer Control:");
        nota1 = sc.nextInt();
        System.out.println("Introduce la Nota del Segundo Control:");
        nota2 = sc.nextInt();
        System.out.println("Introduce la Nota del Tercer Control:");
        nota3 = sc.nextInt();

        media = (nota1 + nota2 + nota3) / 3;

        if (media <= 5) {
            if (media <= 5 && media < 6) {
                System.out.println("Tu nota de Programación es " + media + " - Suficiente");
            } else if (media <= 6 && media < 7) {
                System.out.println("Tu nota de Programación es " + media + " - Bien");
            } else if (media >= 7 && media < 9) {
                System.out.println("Tu nota de Programación es " + media + " - Notable");
            } else {
                System.out.println("Tu nota de Programación es " + media + " - Sobresaliente");
            }
        } else {
            System.out.println("Introduce la Nota de Recuperación:");
            recuperacion = sc.nextLine();
            if (recuperacion.equals("apto")) {
                System.out.println("Tu nota de Programación es 5 - Suficiente");
            } else {
                System.out.println("Tu nota de Programación es " + media + " - Suspenso");
            }
        }
    }
}