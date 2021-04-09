package com.sergiobejaranoarroyo.Unidad2.Tarea8;

import java.util.Scanner;

public class Actividad5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valorMinimo, valorMaximo, respuesta, auxiliar;

        System.out.print("Introduce el Valor Mínimo: ");
        valorMinimo = sc.nextInt();
        System.out.print("Introduce el valor Máximo: ");
        valorMaximo = sc.nextInt();
        System.out.println();

        /** Hacer que los valores sean correctos y no inversos: **/
        if (valorMaximo < valorMinimo) {
            auxiliar = valorMinimo;
            valorMinimo = valorMaximo;
            valorMaximo = auxiliar;
        }

        /** Comprueba que los valores inversos (paso anterior) **/
        /*System.out.println("Valor Mínimo: " + valorMinimo);
        System.out.println("Valor Máximo: " + valorMaximo);
        System.out.println();*/

        do {
            System.out.print("Introduce un Número entre " + valorMinimo + " y " + valorMaximo + ": ");
            respuesta = sc.nextInt();
            System.out.println();
        } while ((respuesta < valorMinimo) || (respuesta > valorMaximo));
    }
}