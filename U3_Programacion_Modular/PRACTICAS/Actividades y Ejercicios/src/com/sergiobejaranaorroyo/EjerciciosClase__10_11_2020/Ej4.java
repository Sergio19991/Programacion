package com.sergiobejaranaorroyo.EjerciciosClase__10_11_2020;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] meses = {31, 28, 31, 30, 31, 30, 3130, 31, 30, 30, 31};
        int mes;

        do {
            System.out.println("Introduce el número del mes:");
            mes = sc.nextInt();

            if (mes >= 1 && mes <= 12) {
                System.out.println("El mes tiene " + meses[mes - 1] + " días.");
            }
        } while (mes >= 1 && mes <= 12);
    }

}