package com.sergiobejaranoarroyo.Unidad2.Tarea3;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte a;
        byte b;

        System.out.print("Introduce el Primer Número: ");
        a = sc.nextByte();
        System.out.print("Introduce el Segundo Número: ");
        b = sc.nextByte();
        System.out.println();

        byte resultado = (byte) (a + b);

        System.out.println(resultado);
    }
}