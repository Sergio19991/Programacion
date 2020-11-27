package com.sergiobejaranaorroyo.Entregable_1920;

import java.awt.event.MouseAdapter;
import java.util.Arrays;

public class Ejercicio5 {
    public static void main(String[] args) {
        int[] numeros = new int[(int) (Math.random() * 30 + 1)];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 1001);
        }

        System.out.println(Arrays.toString(numeros));
        System.out.println("El Número es " + aleatorioDeArray(numeros));
    }

    public static int aleatorioDeArray(int[] v) {
        int num = (int) (Math.random() * v.length);
        System.out.println("Posicioṕn " + num);
        return v[num];
    }

}