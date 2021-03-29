package com.sergiobejaranoarroyo.Unidad2.Tarea3;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float metros = 1609;


        System.out.print("Introduce la longitud en Millas: ");
        float millas = sc.nextInt();
        System.out.println();

        float equivalencia = millas * metros;

        System.out.println(millas + " millas = " + equivalencia + " m");
    }
}