package com.ejercicios16_10_2020;

import java.util.Scanner;

public class ejercicio8b_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamano, i, j, p;
        String caracter;

        System.out.println("Introduce el Tamaño de la Pirámide:");
        tamano = sc.nextInt();
        System.out.println("Introduce el Carácter con el que se pintará la Pirámide:");
        caracter = sc.next();

        System.out.println(" ");   //Simplemente es un espacio en blanco.
                                   //Estética de cara al Usuario.

        for (i=1 ; i<=tamano ; i++) {
            for (j=1 ; j<=tamano-i ; j++) {
                System.out.print(" ");
            }
            for (p=1 ; p<=(i*2)-1 ; p++) {
                System.out.print(caracter);
            }
            System.out.println();   //Salto de línea.
        }
    }
}
