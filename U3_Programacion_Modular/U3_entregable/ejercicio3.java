package com.sergiobejaranaorroyo.Entregable_2021;

public class ejercicio3 {
    public static void main(String[] args) {
        int[] n = {45, 92, 14, 20, 25, 78, 60, 39, 48, 18, 11, 94, 45, 98, 32, 35};
        int[][] bidimensional = new int[0][0];

        for (int i = 0; i < bidimensional.length; i++) {
            for (int j = 0; j < bidimensional[i].length; j++) {
                bidimensional[i][j] = (int) (Math.random() * 101);
            }
        }
    }
}