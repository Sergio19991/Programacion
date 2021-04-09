package com.sergiobejaranoarroyo.Unidad2.Tarea8;

import java.util.Scanner;

public class Actividad4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.print("Introduce un Número: ");
        numero = sc.nextInt();
        System.out.println();

        for (int i = 1; i <= numero; i++) {
            System.out.println(i);
        }
    }
}