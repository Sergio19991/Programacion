package com.sergiobejaranoarroyo.Unidad2.Tarea8b;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora1, hora2, dia1, dia2;

        System.out.print("Introduce el Primer Día: ");
        dia1 = sc.nextInt();
        System.out.print("Introduce las Horas del Primer Día: ");
        hora1 = sc.nextInt();

        System.out.println();

        System.out.print("Introduce el Segundo Día: ");
        dia2 = sc.nextInt();
        System.out.print("Introduce las Horas del Segundo Día: ");
        hora2 = sc.nextInt();

        int resultado = (dia2 - dia1 - 1) * 24 + (24 - hora1) + hora2;

        if ((dia2 < dia1) || (dia1 == dia2) || (hora2 > hora1)) {
            System.out.println("\n" + "El Segundo Día es posterior al Primero.");
        } else {
            System.out.println("\n" + "Total de Horas transcurridas: " + resultado + ".");
        }
    }
}