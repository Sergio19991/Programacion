package com.sergiobejaranoarroyo.Unidad2.Tarea2;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int metros = 1609;


        System.out.print("Introduce la longitud en Millas: ");
        int millas = sc.nextInt();
        System.out.println();

        int equivalencia = millas * metros;

        System.out.println(millas + " millas = " + equivalencia + " m");
    }
}