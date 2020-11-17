package com.sergiobejaranaorroyo.Tarea3;

import java.util.Arrays;

public class Actividad9 {
    public static void main(String[] args) {
        int[] combinacionGanadora = {3, 13, 25, 33, 41, 48};
        int[] apuesta = {3, 25, 41, 42, 45, 49};

        System.out.println("Aciertos: " + primitiva(combinacionGanadora, apuesta));
    }

    public static int primitiva(int[] apuesta, int[] premiado) {
        int aciertos = 0;

        for (int a : apuesta) {
            if (Arrays.binarySearch(premiado, a) >= 0) {
                aciertos++;
            }
        }

        return (aciertos);
    }

}