package com.sergiobejaranaorroyo.CorreccionExamen_GrupoAzul;

public class Ejercicio3 {
    public static void main(String[] args) {

    }

    public static boolean jaque(String posRey, String posReina) {
        String[][] tablero = new String[8][8];
        int[] filas = {8, 7, 6, 5, 4, 3, 2, 1,};
        String[] columnas = {"a", "b", "c", "d", "f", "g", "h"};
        int filaR=0;
        int colR=0;
        int filaRey=0;
        int colRey=0;

        for (int i = 0; i < filas.length; i++) {
            if (filas[i] == Integer.valueOf(posReina.charAt(1))) {
                filaR = i;
            }
        }

        for (int i = 0; i < filas.length; i++) {
            if (filas[i] == Integer.valueOf(posRey.charAt(1))) {
                filaRey = i;
            }
        }

        for (int i = 0; i < columnas.length; i++) {
            if (columnas[i].charAt(0)==posRey.charAt(0)) {
                colR=i;
            }
        }

        for (int i = 0; i < columnas.length; i++) {
            if (columnas[i].charAt(0)==posRey.charAt(0)) {
                colRey=i;
            }
        }

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (i == filaR || j == colR || i + j == filaR + colR || i - j == filaR - colR) {
                    if (i == filaRey && j == colRey) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

}
