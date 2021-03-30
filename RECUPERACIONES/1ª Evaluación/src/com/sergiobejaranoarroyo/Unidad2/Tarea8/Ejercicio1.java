package com.sergiobejaranoarroyo.Unidad2.Tarea8;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.println();
            System.out.print("Introduce un Número: ");
            numero = sc.nextInt();
            System.out.println();

            //Comprobar si es Par o Impar:
            if (numero % 2 == 0) {
                System.out.println("El Número " + numero + " es Par.");
            } else {
                System.out.println("El Número " + numero + " es Impar.");
            }

            //Comprobar si es Positivo o Negativo:
            if (numero > 0) {
                System.out.println("El Número " + numero + " es Positivo.");
            } else {
                System.out.println("El Número " + numero + " es Negativo.");
            }

            //Calcular el cuadrado;
            int cuadrado = (int) (Math.pow(numero, 2));
            System.out.println("El Cuadrado de " + numero + " es " + cuadrado + ".");
        } while (numero != 0);
    }
}