package com.sergiobejaranoarroyo.Unidad2.Tarea8;

import java.util.Scanner;

public class Actividad13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;
        int cantidadAprobados = 0;
        int cantidadCondicionados = 0;
        int cantidadSuspensos = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.print("Introduce la Nota: ");
            nota = sc.nextInt();

            if (nota > 4) {   //Cantidad de Aprobados.
                cantidadAprobados++;
            } else if (nota == 4) {   //Cantidad de Condicionados.
                cantidadCondicionados++;
            } else {   //Cantidad de Suspensos.
                cantidadSuspensos++;
            }
        }

        System.out.println();

        System.out.println("Cantidad de Aprobados: " + cantidadAprobados);
        System.out.println("Cantidad de Condiconados: " + cantidadCondicionados);
        System.out.println("Cantidad de Suspensos: " + cantidadSuspensos);
    }
}