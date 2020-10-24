package com.ejercicios15_10_2020;

import java.util.Scanner;

public class ejercicio8_14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tamano;

        System.out.println("Introduce el Tamaño de la Figura");
        tamano = sc.nextInt();

        for (int i=0 ; i<tamano ; i++) {
            for (int j=0 ; j<tamano-i ; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
