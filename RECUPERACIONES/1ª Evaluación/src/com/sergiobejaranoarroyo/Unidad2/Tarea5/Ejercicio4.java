package com.sergiobejaranoarroyo.Unidad2.Tarea5;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroPares = 0;

        System.out.print("Introduce el Primer Número: ");
        int primerNumero = sc.nextInt();
        System.out.print("Introduce el Segundo Número: ");
        int segundoNumero = sc.nextInt();

        if (primerNumero % 2 == 0) {
            numeroPares++;
        }

        if (segundoNumero % 2 == 0) {
            numeroPares++;
        }

        System.out.println();

        System.out.println("Total de Pares: " + numeroPares);
    }
}