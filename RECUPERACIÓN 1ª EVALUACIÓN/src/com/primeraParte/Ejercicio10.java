package com.primeraParte;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int altura, anchura, a, b;

        System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
        altura = teclado.nextInt();
        System.out.print("Ahora introduzca la anchura (como mínimo 4): ");
        anchura = teclado.nextInt();

        a = (int) ((Math.random() * (anchura - 1)) + 1);
        System.out.println(a);

        b = (int) ((Math.random() * (altura - 1)) + 1);
        System.out.println(b);

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < anchura; j++) {
                if ((j == 0) || (j == anchura - 1) || (i == 0) || (i == altura - 1)) {
                    System.out.print("* ");
                } else if ((j == a) && (i == b)) {
                    System.out.print("&");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
    }
}