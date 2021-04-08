package com.sergiobejaranoarroyo.Unidad2.Tarea7;

import java.util.Scanner;

public class Actividad2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad, nivel_de_estudios, ingresos;
        boolean jasp = true;

        System.out.print("Introduce la Edad: ");
        edad = sc.nextInt();
        System.out.print("Introduce el Nivel de Estudios: ");
        nivel_de_estudios = sc.nextInt();
        System.out.print("Introduce los Ingresos: ");
        ingresos = sc.nextInt();
        System.out.println();

        if ((edad <= 28) && (nivel_de_estudios > 3) && (ingresos > 28000)) {
            jasp = true;
        } else {
            jasp = false;
        }

        System.out.println(jasp);
    }
}