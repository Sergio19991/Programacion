package com.sergiobejaranoarroyo;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el Tamaño del Vector:");
        int tamanoVector = sc.nextInt();

        int[] vectorEnteros = new int[tamanoVector];

        for (int i = 0; i < vectorEnteros.length; i++) {
            vectorEnteros[i] = (int) (Math.random() * tamanoVector);
        }

        System.out.println("Introduce un Valor:");
        int valor = sc.nextInt();

        System.out.println("Introduce una Posición:");
        int posicion = sc.nextInt();

        if (posicion > tamanoVector) {
            System.out.println("La Posición es Mayor a la Longitud del Vector.");
            System.out.println(Arrays.toString(vectorEnteros));
        }

        System.out.println(insertarValor(vectorEnteros, valor, posicion));
    }

    public static int insertarValor(int[] vectorEnteros, int valor, int posicion) {
        int resultado = insertarValor(vectorEnteros, valor, posicion);

        for (int i = 0; i < vectorEnteros.length; i++) {
            if (valor < vectorEnteros.length + posicion) {
                vectorEnteros[i + 1] = vectorEnteros.length + valor;
            }
        }

        return resultado;
    }

}