package com.sergiobejaranoarroyo.Unidad2.Tarea7;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad, nivel_de_estudios, ingresos;
        boolean jasp = false;

        System.out.print("Introduce tu Edad: ");
        edad = sc.nextInt();
        System.out.print("Introduce tu Nivel de Estudios: ");
        nivel_de_estudios = sc.nextInt();
        System.out.print("Introduce tus Ingresos: ");
        ingresos = sc.nextInt();

        if ((edad <= 28) && (nivel_de_estudios > 3) && (ingresos > 28000)) {
            System.out.println();
            jasp = true;
            System.out.println(jasp);
        } else {
            System.out.println();
            jasp = false;
            System.out.println(jasp);
        }
    }
}