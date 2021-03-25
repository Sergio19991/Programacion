package com.sergiobejaranoarroyo.Unidad2.Tarea4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero;

        System.out.print("Introduce un Número: ");
        numero = sc.nextDouble();

        int redondeado = (int) (Math.round(numero));
        System.out.println();
        System.out.println(redondeado);
    }
}