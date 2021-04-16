package com.sergiobejaranoarroyo.Unidad2.Tarea8b;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el Primer Día: ");
        String dia1 = sc.toString();
        System.out.print("Introduce las Horas de " + dia1 + ": ");
        int hora1 = sc.nextInt();
    }
}