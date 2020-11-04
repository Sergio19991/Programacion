package com.bucles_con_do_while;

import java.util.Scanner;

public class ejercicio6_2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte tamano, fila, columna;

        System.out.println("Introduce el Tamño del Cuadrado:");
        tamano = sc.nextByte();

        fila = 0;

        do {
            columna = 0;
            do {
                System.out.print(" * ");
                columna++;
            } while (columna < tamano);
            System.out.println(" ");
            fila++;
        } while (fila < tamano);
    }
}