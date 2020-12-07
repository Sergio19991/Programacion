package com.sergiobejaranaorroyo.EjerciciosPropuestos_josedomingo;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dias = new int[12];
        String[] nombreMes = new String[12];
        int mes;

        dias[0] = 31;
        dias[1] = 28;
        dias[2] = 31;
        dias[3] = 30;
        dias[4] = 31;
        dias[5] = 30;
        dias[6] = 31;
        dias[7] = 31;
        dias[8] = 30;
        dias[9] = 31;
        dias[10] = 30;
        dias[11] = 31;

        nombreMes[0] = "Enero";
        nombreMes[1] = "Febrero";
        nombreMes[2] = "Marzo";
        nombreMes[3] = "Abril";
        nombreMes[4] = "Mayo";
        nombreMes[5] = "Junio";
        nombreMes[6] = "Julio";
        nombreMes[7] = "Agosto";
        nombreMes[8] = "Septiembre";
        nombreMes[9] = "Octubre";
        nombreMes[10] = "Noviembre";
        nombreMes[11] = "Diciembre";

        do {
            System.out.println("Introduce un mes (1-12):");
            mes = sc.nextInt();

            if (mes < 1 || mes > 12) {
                System.out.println("¡¡¡MES INCORRECTO!!!");
            }
        } while (mes >= 1 && mes <= 12);

        System.out.println("El Mes de " + nombreMes[mes - 1] + ", tiene " + dias[mes - 1] + " días.");
    }
}