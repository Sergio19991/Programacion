package com.sergiobejaranaorroyo.Tarea3;

import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i;
        int contador_ceros = 0;
        double suma_positivos = 0;
        double suma_negativos = 0;
        double contador_positivos = 0;
        double contador_negativos = 0;

        System.out.println("Introduce la Cantidad de Números:");
        n = sc.nextInt();

        int[] numeros = new int[n];

        for (i = 0; i < numeros.length; i++) {
            System.out.println("Introduce un Número:");
            numeros[i] = sc.nextInt();

            if (numeros[i] < 0) {
                contador_negativos++;
                suma_negativos = suma_negativos + numeros[i];
            } else if (numeros[i] > 0) {
                contador_positivos++;
                suma_positivos = suma_positivos + numeros[i];
            } else {
                contador_ceros++;
            }
        }

        System.out.println("Media de los Números Positivos: " + (suma_positivos / contador_positivos));
        System.out.println("Media de los Números Negativos: " + (suma_negativos / contador_negativos));
        System.out.println("Cantidad de Ceros: " + contador_ceros);
    }

}