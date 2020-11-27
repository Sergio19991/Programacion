package com.sergiobejaranaorroyo.EjerciciosClase__26_11_2020;

import java.util.Scanner;

public class TablaAjederez_Torre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca altura");
        int altura = sc.nextInt();

        for (int f = 1; f <= altura; ++f) {
            for (int c = 1; c <= (altura + 1) / 2 + 5; ++c) {
                if (f + c >= (altura + 1) / 2 + 1 && f - c <= altura / 2 && c <= (altura + 1) / 2) {
                    System.out.print(" *");
                } else if (f == (altura + 1) / 2) {
                    System.out.print(" *");
                } else {
                    System.out.print(" -");
                }
            }

            System.out.println("");
        }

    }
}