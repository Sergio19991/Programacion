package com.sergiobejaranoarroyo.Unidad2.Entregable2021;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, cantidadEliminados = 0, resultado = 0;

        System.out.print("Introduzca un número entero positivio: ");
        numero = sc.nextInt();

        System.out.println("Número resultado: " + resultado);

        System.out.println("Dígitos eliminados: " + cantidadEliminados);
    }
}