package com.sergiobejaranoarroyo.Unidad2.Tarea8;

import java.util.Scanner;

public class Actividad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        /*System.out.print("Introduce un Número: ");
        numero = sc.nextInt();
        System.out.println();*/

        do {
            System.out.print("Introduce un Número: ");
            numero = sc.nextInt();
            System.out.println();

            if (numero != 0) {
                /** Comprueba si "numero" es Par o Impar: **/
                if (numero % 2 == 0) {
                    System.out.println("El Número " + numero + " es Par.");
                } else {
                    System.out.println("El Número " + numero + " es Impar.");
                }

                /** Comprueba si "numero" es Positivo o Negativo: **/
                if (numero < 0) {
                    System.out.println("El Número " + numero + " es Negativo.");
                } else {
                    System.out.println("El Número " + numero + " es Positivo.");
                }

                /** Optiene el Cuadrado de "numero": **/
                System.out.println("El Cuadrado de " + numero + " es " + (int) (Math.pow(numero, 2)) + ".");
                System.out.println();
                System.out.println();
            }
        } while (numero != 0);
    }
}