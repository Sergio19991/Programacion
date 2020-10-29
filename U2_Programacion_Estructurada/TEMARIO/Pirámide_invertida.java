package com.ejercicios27_10_2020;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura, fila, columna, anchura;

        System.out.println("Introduce la Altura:");
        altura = sc.nextInt();

        anchura=2*altura-1;

        for (fila=0 ; fila<altura ; fila++) {
            //Imprimo los Espacios.
            for (columna=0 ; columna<fila ; columna++) {
                System.out.print(" ");
            }

            //Imprimo los Asteriscos.
            for (columna=0 ; columna<anchura-2*fila ; columna++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
