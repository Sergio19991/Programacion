package com.sergiobejaranaorroyo.EjerciciosPropuestos_josedomingo;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        int numeroFilas = 5, numeroColumnas = 5, suma, fila, columna;

        for (fila = 0; fila < numeroFilas - 1; fila++) {
            for (columna = 0; columna < numeroColumnas - 1; columna++) {
                System.out.print("Introduce el Número de la Fila " + fila + 1 + " y columna " + columna + 1);
                matriz[fila][columna] = sc.nextInt();
            }
        }

        for (fila = 0; fila < numeroFilas - 1; fila++) {

            suma = 0;

            for (columna = 0; columna < numeroColumnas - 1; columna++) {
                suma = suma + matriz[fila][columna];
            }

            System.out.println("La Suma de los elementos de la Fila " + fila + 1 + ", es " + suma);
        }

        for (columna = 0; columna < numeroColumnas - 1; columna++) {

            suma = 0;

            for (fila = 0; fila < numeroFilas - 1; fila++) {
                suma = suma + matriz[fila][columna];
            }

            System.out.println("La Suma de los elementos de la Columna " + columna + 1 + ", es " + suma);
        }
    }
}