package com.sergiobejaranoarroyo.Unidad2.Tarea5;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el Primer Número: ");
        long primerNumero = sc.nextLong();
        System.out.print("Introduce el Segundo Número: ");
        long segundoNumero = sc.nextLong();
        System.out.print("Introduce el Tercer Número: ");
        long tercerNumero = sc.nextLong();

        if ((primerNumero > segundoNumero) && (primerNumero > tercerNumero)) {
            System.out.println("MAYOR: " + primerNumero);
        } else if ((segundoNumero > primerNumero) && (segundoNumero > tercerNumero)) {
            System.out.println("MAYOR: " + segundoNumero);
        } else if ((tercerNumero > primerNumero) && (tercerNumero > segundoNumero)) {
            System.out.println("MAYOR: " + tercerNumero);
        }
    }
}