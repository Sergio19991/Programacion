package com.sergiobejaranaorroyo.EjerciciosPropuestos_josedomingo;

public class Ejercicio5 {
    public static void main(String[] args) {
        int[] vector = new int[10];
        int cambios = 0, auxiliar, tamanoVector = 10;

        for (int i = 0; i < tamanoVector - 1; i++) {
            vector[i] = (int) (Math.random() * 10);
        }

        do {
            for (int i = 0; i < tamanoVector - 2; i++) {
                if (vector[i] > vector[i + 1]) {
                    auxiliar = vector[i];
                    vector[i] = vector[i + 1];
                    vector[i + 1] = auxiliar;
                    cambios = cambios + 1;
                }
            }
        } while (cambios == 0);

        for (int i = 0; i < tamanoVector - 1; i++) {
            System.out.print(vector[i]);
        }
    }
}