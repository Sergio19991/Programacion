package com.sergiobejaranaorroyo.Entregable_2021;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a;
        int[] b;
        int[] resultado = {};
        int tamanoPrimerVector;
        int tamanoSegundoVector;

        System.out.println("Introduce el Tamaño del Primer Vector:");
        tamanoPrimerVector = sc.nextInt();
        System.out.println("Introduce el Tamaño del Segundo Vector:");
        tamanoSegundoVector = sc.nextInt();

        a = new int[tamanoPrimerVector];
        b = new int[tamanoSegundoVector];

        /** Relleno el Vector origen con Números Aleatorios (entre 0 y 100) **/
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 101);
        }
        System.out.println("Primer Vector = " + Arrays.toString(a));

        /** Relleno el Vector destino con Números Aleatorios (entre 0 y 100) **/
        for (int i = 0; i < b.length; i++) {
            b[i] = (int) (Math.random() * 101);
        }
        System.out.println("Primer Vector = " + Arrays.toString(b));

        resultado = Arrays.copyOf(a, b.length+1);
        System.out.println(Arrays.toString(resultado));
    }
}