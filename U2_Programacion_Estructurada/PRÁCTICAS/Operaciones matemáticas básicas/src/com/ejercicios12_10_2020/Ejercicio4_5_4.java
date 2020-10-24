package com.ejercicios12_10_2020;

    /*
        Crea un programa que pida al usuario una longitud en millas (por ejemplo, 3) y calcule su equivalencia en kilómetros,
        usando datos de tipo float (1 milla = 1.609 km).
     */

import java.util.Scanner;

public class Ejercicio4_5_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de Millas:");
        Float millas = sc.nextFloat();
        System.out.println(millas + " millas son " + (millas * 1.609) + "Km.");
    }
}




     //Sergio Bejarano Arroyo.
