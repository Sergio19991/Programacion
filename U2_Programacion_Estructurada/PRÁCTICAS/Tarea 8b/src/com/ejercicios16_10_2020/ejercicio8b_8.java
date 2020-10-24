package com.ejercicios16_10_2020;

import java.util.Scanner;

public class ejercicio8b_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d1, h1, d2, h2, resultado;

        System.out.print("Introduce el Primer Día: ");
        d1 = sc.nextInt();
        System.out.print("Introduce las Horas del Primer día: ");
        h1 = sc.nextInt();

        System.out.println(" ");

        System.out.print("Introduce el Segundo Día: ");
        d2 = sc.nextInt();
        System.out.print("Introduce las Horas del Segundo Día: ");
        h2 = sc.nextInt();

        if (d2<d1 || d1==d2 && h2>h1) {
            System.out.println("El Segundo Día es posterior al Primerp.");
        } else {
            resultado = (d2-d1-1)*24+(24-h1)+h2;
            System.out.println(" ");
            System.out.println("Número de Horas transcurridas: " + resultado);
        }
    }
}
