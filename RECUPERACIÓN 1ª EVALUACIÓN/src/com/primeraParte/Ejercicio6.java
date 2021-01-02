package com.primeraParte;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, posicion, nuevo;

        System.out.print("Por favor, introduzca un número entero positivo: ");
        numero = sc.nextInt();
        System.out.print("Introduzca la posición dentro del número: ");
        posicion = sc.nextInt();
        System.out.print("Introduzca el nuevo dígito: ");
        nuevo = sc.nextInt();

        int num1 = numero;
        int longitud = 0;
        int reves = 0;

        while (num1 > 0) {
            reves = (reves * 10) + (num1 % 10);
            num1 /= 10;
            longitud++;
        }

        int num2 = 0;

        for (int i = 0; i < posicion; i++) {
            num2 = ((num2 * 10) + (reves % 10));
            reves /= 10;
        }

        num2 = ((num2 * 10) + nuevo);
        reves /= 10;

        while (posicion < longitud) {
            num2 = ((num2 * 10) + (reves % 10));
            reves /= 10;
            posicion++;
        }

        System.out.println("El número resultante es: " + num2);
    }
}