package com.primeraParte;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura, fila, columna;

        System.out.print("Por favor, introduzca la altura de la X: ");
        altura = sc.nextInt();

        while ((altura < 3) || (altura % 2 == 0)) {
            System.out.print("¡ERROR!; Debe ser Impar y mayot o Igual a 3.");
            System.out.print("Por favor, introduzca la altura de la X: ");
            altura = sc.nextInt();
        }

        for (fila = 0; fila <= altura; fila++) {
            for (columna = 1; columna <= altura; columna++) {
                if ((fila == columna) || (columna == (altura - fila) + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}