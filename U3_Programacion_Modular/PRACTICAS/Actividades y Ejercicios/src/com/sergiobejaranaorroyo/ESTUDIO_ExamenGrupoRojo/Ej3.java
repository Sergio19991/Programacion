package com.sergiobejaranaorroyo.ESTUDIO_ExamenGrupoRojo;

import java.util.Arrays;

public class Ej3 {
    public static void main(String[] args) {
        String[] pais = {"España", "Rusia", "Japón", "Australia"};
        int[][] estatura = new int[4][10];
        int media = 0, max = 0, min = 0;

        System.out.printf("%62s %3s %3s %3s", "", "MED", "MIN", "MAX");
        System.out.println();

        for (int i = 0; i < estatura.length; i++) {
            media = 0;
            for (int j = 0; j < estatura[0].length; j++) {
                estatura[i][j] = (int) ((Math.random() * 71) + 140);
                media += estatura[i][j];
                if (j == 0) {
                    min = estatura[i][j];
                    max = estatura[i][j];
                } else {
                    if (min > estatura[i][j]) {
                        min = estatura[i][j];
                    }
                    if (max < estatura[i][j]) {
                        max = estatura[i][j];
                    }
                }
            }
            System.out.printf("%9s:" + Arrays.toString(estatura[i]) + " | %3d %3d %3d", pais[i], (media / estatura[0].length), min, max);
            System.out.println();
        }
    }
}