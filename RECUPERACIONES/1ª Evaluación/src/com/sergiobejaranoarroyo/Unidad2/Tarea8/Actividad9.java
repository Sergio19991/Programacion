package com.sergiobejaranoarroyo.Unidad2.Tarea8;

import java.util.Scanner;

public class Actividad9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura, maximo = 0, identificador = 0;

        do {
            System.out.print("Introduce la Altura del Árbol " + identificador + ": ");
            altura = sc.nextInt();

            if (altura > maximo) {
                maximo = altura;
            }

            identificador++;
        } while (altura != -1);

        System.out.println("\n" + "El Árbol más alto mide " + maximo + " cm.");
    }
}