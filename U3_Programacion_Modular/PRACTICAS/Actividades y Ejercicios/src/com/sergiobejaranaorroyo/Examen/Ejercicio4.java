package com.sergiobejaranaorroyo.Examen;

public class Ejercicio4 {
    public static void main(String[] args) {
        int[][] array = new int[5][4];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 101 + 10);
            }
        }
    }
}