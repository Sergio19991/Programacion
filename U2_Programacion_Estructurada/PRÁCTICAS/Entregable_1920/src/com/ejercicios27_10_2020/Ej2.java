package com.ejercicios27_10_2020;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        int num, aux, inverso = 0, cifra;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Por favor, introduzca un número entero positivo:");
            num = sc.nextInt();
        } while (num < 10);

        aux = num;

        while (aux != 0) {
            cifra = aux % 10;
            inverso = inverso * 10 + cifra;
            aux = aux / 10;
        }

        if (num == inverso) {
            System.out.println("El " + num + " es capicúa.");
        } else {
            System.out.println("El " + num + " no es capicúa.");
        }
    }
}
