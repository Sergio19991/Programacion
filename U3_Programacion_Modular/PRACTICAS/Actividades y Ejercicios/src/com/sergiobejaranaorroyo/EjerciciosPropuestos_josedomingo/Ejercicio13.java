package com.sergiobejaranaorroyo.EjerciciosPropuestos_josedomingo;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nombre = new String[10];
        String[] dias = new String[7];
        int[][] kms = new int[10][8];
        int numeroConductores, indiceConductor, indiceDias, tamanoCoductoresMaximo = 10;

        dias[0] = "Lunes";
        dias[1] = "Martes";
        dias[2] = "Miércoles";
        dias[3] = "Jueves";
        dias[4] = "Viernes";
        dias[5] = "Sábado";
        dias[6] = "Domingo";

        do {
            System.out.print("¿Cuántos Conductores tiene la Empresa:?");
            numeroConductores = sc.nextInt();

            if (numeroConductores > tamanoCoductoresMaximo) {
                System.out.println("Como máximo puedo guradar la información de " + tamanoCoductoresMaximo + " Conductores.");
            }
        } while (numeroConductores <= tamanoCoductoresMaximo);

        for (indiceConductor = 0; indiceConductor < numeroConductores - 1; indiceConductor++) {
            System.out.print("Nombre del Conductor " + indiceConductor + 1 + ":");
            nombre[indiceConductor] = sc.nextLine();

            for (indiceDias = 0; indiceDias <= 6; indiceDias++) {
                System.out.print("¿Cuántos Kilómetros ha realizado el " + dias[indiceDias] + "?:");
                kms[indiceConductor][indiceDias] = sc.nextInt();
            }
        }

        for (indiceConductor = 0; indiceConductor < numeroConductores - 1; indiceConductor++) {
            kms[indiceConductor][7] = 0;

            for (indiceDias = 0; indiceDias <= 6; indiceDias++) {
                kms[indiceConductor][7] = kms[indiceConductor][7] + kms[indiceConductor][indiceDias];
            }
        }

        for (indiceConductor = 0; indiceConductor < numeroConductores - 1; indiceConductor++) {
            System.out.println(nombre[indiceConductor] + " ha realizado " + kms[indiceConductor][7] + " kms.");
        }
    }
}