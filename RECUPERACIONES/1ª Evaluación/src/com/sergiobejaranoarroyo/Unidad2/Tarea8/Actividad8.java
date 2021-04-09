package com.sergiobejaranoarroyo.Unidad2.Tarea8;

import java.util.Scanner;

public class Actividad8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, resultado = 1;

        System.out.print("Introduce un Número: ");
        numero = sc.nextInt();
        System.out.println();

        System.out.print("Factoria de " + numero + ":" + "\n" + numero + "! = ");

        for (int i = numero; i >= 1; i--) {
            resultado = resultado * i;
            System.out.print("x" + i);
        }

        System.out.println(" = " + resultado);
    }
}