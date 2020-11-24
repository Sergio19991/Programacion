package com.sergiobejaranaorroyo.Tarea4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] filas = {8, 7, 6, 5, 4, 3, 2, 1};
        String[] columnas = {"a", "b", "c", "d", "e", "f", "g", "h"};
        int fila_inicial = 3;
        int columna_inicial = 3;

        System.out.println("Posición Inicial: " + columnas[columna_inicial] + filas[fila_inicial]);

        //DIAGONAL SUPERIOR - DERECHA:

        int fila = fila_inicial--;
        int columna = columna_inicial++;
        while (fila >= 0 && fila < 8 && columna >= 0 && columna < 8) {
            System.out.print(columnas[columna] + filas[fila] + " ");
            fila--;
            columna++;
        }

        fila = fila_inicial - 1;
        columna = columna_inicial - 1;
        //DIAGONAL SUPERIOR - IZQUIERDA:
        while (fila >= 0 && fila < 8 && columna >= 0 && columna < 8) {
            System.out.print(columnas[columna] + filas[fila] + " ");
            fila--;
            columna--;
        }

        fila = fila_inicial + 1;
        columna = columna_inicial + 1;
        //DIAGONAL INFERIOR - DERECHA:
        while (fila >= 0 && fila < 8 && columna >= 0 && columna < 8) {
            System.out.print(columnas[columna] + filas[fila] + " ");
            fila++;
            columna++;
        }

        fila = fila_inicial + 1;
        columna = columna_inicial - 1;
        //DIAGONAL INFERIOR - IZQUIERDA:
        while (fila >= 0 && fila < 8 && columna >= 0 && columna < 8) {
            System.out.print(columnas[columna] + filas[fila] + " ");
            fila++;
            columna--;
        }
    }
}