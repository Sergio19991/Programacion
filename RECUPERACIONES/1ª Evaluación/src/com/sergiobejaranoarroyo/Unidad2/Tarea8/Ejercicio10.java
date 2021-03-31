package com.sergiobejaranoarroyo.Unidad2.Tarea8;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.print("Introduce un Número entre 1 y 10: ");
        numero = sc.nextInt();

        while ((numero < 1) || (numero > 10)) {
            System.out.print("Introduce un Número entre 1 y 10: ");
            numero = sc.nextInt();
        }

        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " X " + i + " = " + (numero * i));
        }
    }
}