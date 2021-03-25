package com.sergiobejaranoarroyo.Unidad2.Tarea5;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un Número: ");
        int numero = sc.nextInt();

        if (numero <= 0) {
            System.out.println("NEGATIVO");
        } else if (numero > 0) {
            System.out.println("POSITIVO");
        }
    }
}