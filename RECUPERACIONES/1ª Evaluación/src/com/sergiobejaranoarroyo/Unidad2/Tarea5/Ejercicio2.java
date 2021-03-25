package com.sergiobejaranoarroyo.Unidad2.Tarea5;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int doce = 12;

        System.out.print("Introduce el Número " + doce + ": ");
        int numeroUsuario = sc.nextInt();
        System.out.println();

        if (numeroUsuario == doce) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
}