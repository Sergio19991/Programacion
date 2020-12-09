package com.sergiobejaranaorroyo.EjerciciosPropuestos_josedomingo;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] equipos = new String[15][2];

        int[][] resultados = new int[15][2];

        int numeroEquipos = 15;

        for (int i = 0; i < numeroEquipos - 1; i++) {
            System.out.println("Introduce el Nombre del Equipo 1, del Partido " + i + 1);
            equipos[i][0] = sc.nextLine();
            System.out.println("Introduce el Nombre del Equipo 2, del Partido " + i + 1);
            equipos[i][1] = sc.nextLine();
            System.out.println("Introduce los Goles metidos por el equipo " + equipos[i][0]);
            equipos[i][0] = sc.nextLine();
            System.out.println("Introduce los Goles metidos por el equipo " + equipos[i][1]);
            equipos[i][1] = sc.nextLine();
        }

        System.out.println("****************");
        System.out.println("*** QUINIELA ***");
        System.out.println("****************");

        for (int i = 0; i < numeroEquipos - 1; i++) {
            if (resultados[i][0] > resultados[i][1]) {
                System.out.println(equipos[i][0] + " - " + equipos[i][0] + "   --->   1");
            } else {
                if (resultados[i][0] < resultados[i][1]) {
                    System.out.println(equipos[i][0] + " - " + equipos[i][0] + "   --->   2");
                } else {
                    System.out.println(equipos[i][0] + " - " + equipos[i][0] + "   --->   X");
                }
            }
        }
    }
}