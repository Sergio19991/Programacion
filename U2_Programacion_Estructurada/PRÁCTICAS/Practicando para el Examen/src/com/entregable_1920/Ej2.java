package com.entregable_1920;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, auxiliar, inverso, cifra;
        inverso = 0;

        do {
            System.out.println("Por favor, introduzca un número entero positivo:");
            numero = sc.nextInt();
        } while (numero < 10);

        auxiliar = numero;

        while (auxiliar != 0) {
            cifra = auxiliar % 10;
            inverso = inverso * 10 + cifra;
            auxiliar = auxiliar / 10;
        }

        if (numero == inverso) {
            System.out.println("El " + numero + " es capicúa.");
        } else {
            System.out.println("El " + numero + " no es capicúa.");
        }
    }
}