package com.sergiobejaranaorroyo.EjerciciosClase__26_11_2020;

import java.util.Arrays;
import java.util.Scanner;

public class TablaAjederez_Caballo {
    public static void main(String[] args) {
        new Scanner(System.in);
        int[] var10000 = new int[]{7, 6, 5, 4, 3, 2, 1, 0};
        String[] var11 = new String[]{"a", "b", "c", "d", "e", "f", "g", "h"};
        String[][] tablero = new String[8][8];
        boolean columnaInicial = true;
        int cabf = 3;
        int cabc = 6;

        int f;
        for (f = 0; f < tablero.length; ++f) {
            for (int c = 0; c < tablero[f].length; ++c) {
                if ((c == cabc - 2 && f == cabf - 1 || c == cabc - 1 && f == cabf - 2 || c == cabc + 1 && f == cabf - 2 || c == cabc + 2 && f == cabf - 1 || c == cabc - 2 && f == cabf + 1 || c == cabc - 1 && f == cabf + 2 || c == cabc + 1 && f == cabf + 2 || c == cabc + 2 && f == cabf + 1) && c <= 7) {
                    tablero[f][c] = "✠";
                } else if ((f + c) % 2 == 1) {
                    tablero[f][c] = "❑ ";
                } else {
                    tablero[f][c] = "▦";
                }
            }
        }

        System.out.println();
        tablero[cabf][cabc] = "♞";
        tablero[7][0] = "♜";
        tablero[7][1] = "♞";
        tablero[7][2] = " ♝";
        tablero[7][3] = "♛";
        tablero[7][4] = "♚";
        tablero[7][5] = "♝";
        tablero[7][7] = "♜";
        tablero[6][0] = "♟";
        tablero[6][1] = "♟";
        tablero[6][2] = "♟";
        tablero[6][3] = " ♟";
        tablero[6][4] = "♟";
        tablero[6][5] = " ♟";
        tablero[6][6] = "♟";
        tablero[6][7] = "♟";
        tablero[0][0] = "♖";
        tablero[0][1] = "♘";
        tablero[0][2] = " ♗";
        tablero[0][3] = "♕";
        tablero[0][4] = "♔";
        tablero[0][5] = " ♗";
        tablero[0][6] = "♘";
        tablero[0][7] = "♖";
        tablero[1][0] = "♙";
        tablero[1][1] = "♙";
        tablero[1][2] = "♙";
        tablero[1][3] = " ♙";
        tablero[1][4] = "♙";
        tablero[1][5] = " ♙";
        tablero[1][6] = "♙";
        tablero[1][7] = "♙";

        for (f = 0; f < tablero.length; ++f) {
            System.out.println(Arrays.toString(tablero[f]));
        }

    }
}