package com.sergiobejaranaorroyo.EjerciciosPropuestos_josedomingo;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] cantidad = new int[4][5];
        int[] precio = new int[5];
        int suma, numeroMayor, articulosSucursal, mayorRec, totalSucursal, totalEmpresa;

        for (int i = 0; i < 4; i++) {
            System.out.println("Introduce el Precio del Artículo " + i + 1 + ":");
            precio[i] = sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Introduce la Cnatidad de Artículos " + j + 1 + ", en Sucursal " + i + 1);
                cantidad[j][i] = sc.nextInt();
            }
        }

        System.out.println("Cantidades por Artículos:");
        for (int i = 0; i < 4; i++) {
            suma = cantidad[0][i] + cantidad[1][i] + cantidad[2][i] + cantidad[3][i];
            System.out.println("Total del Artículo " + i + 1 + ":" + suma);
        }

        articulosSucursal = 0;
        for (int i = 0; i < 4; i++) {
            articulosSucursal = articulosSucursal + cantidad[1][i];
        }
        System.out.println("Total Sucursal: " + articulosSucursal);

        System.out.println("Sucursal 1, " + "Sucursal 3, " + cantidad[0][2]);

        mayorRec = 0;
        numeroMayor = 0;
        totalEmpresa = 0;

        for (int i = 0; i < 3; i++) {
            totalSucursal = 0;

            for (int j = 0; j < 4; j++) {
                totalSucursal = totalSucursal + (cantidad[j][i] * precio[j]);

                System.out.println("Recaudaciones Sucursal " + i + 1 + ": " + totalSucursal);

                if (totalSucursal > mayorRec) {
                    mayorRec = totalSucursal;
                    numeroMayor = i + 1;
                }

                totalEmpresa = totalEmpresa + totalSucursal;
            }
        }

        System.out.println("Recaudación Total de la Empresa: " + totalEmpresa);
        System.out.println("Sucursal de Mayor Recaudación: " + numeroMayor);
    }
}