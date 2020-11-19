package com.sergiobejaranaorroyo.EjerciciosClase__17_11_2020;

import java.util.Arrays;
import java.util.Scanner;

public class InsertarEnOrden {
    public static void main(String[] args) {
        int[] vector = {1, 2, 3, 7, 5, 6};

        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Introduce un Número:");
        numero = sc.nextInt();
        System.out.println(" ");

        vector = insertarOrden(numero, vector);

        System.out.println("El Vector Ordenado y con " + numero + ", quedaría     --->     " + Arrays.toString(vector));
    }

    public static int[] insertarOrden(int num, int[] v) {
        int[] posicion = new int[v.length + 1];

        Arrays.sort(v);

        int contador = 0;

        for (int i = 0; i < v.length; i++) {
            if (num > v[i]) {
                posicion[i] = v[i];
                contador++;
            } else {
                posicion[i + 1] = v[i];
            }
        }

        posicion[contador] = num;

        return posicion;
    }

}