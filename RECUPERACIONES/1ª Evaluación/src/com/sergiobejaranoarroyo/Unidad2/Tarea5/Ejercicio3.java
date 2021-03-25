package com.sergiobejaranoarroyo.Unidad2.Tarea5;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un Número: ");
        int numeroUsuario = sc.nextInt();
        System.out.println();

        if (numeroUsuario % 2 != 0) {
            System.out.println("IMPAR");
        } else {
            System.out.println("PAR");
        }
    }
}