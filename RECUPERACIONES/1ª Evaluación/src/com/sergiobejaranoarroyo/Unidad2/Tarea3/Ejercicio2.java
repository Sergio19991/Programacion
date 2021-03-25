package com.sergiobejaranoarroyo.Unidad2.Tarea3;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el año de tu Nacimiento: ");
        short anoNacimiento = sc.nextShort();
        System.out.print("Introduce el año Actual: ");
        short anoActual = sc.nextShort();
        System.out.println();

        short diferencia = (short) (anoActual - anoNacimiento);

        System.out.println("Edad: " + diferencia);
    }
}