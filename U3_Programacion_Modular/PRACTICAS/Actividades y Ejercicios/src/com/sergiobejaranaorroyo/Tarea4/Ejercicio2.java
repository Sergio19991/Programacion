package com.sergiobejaranaorroyo.Tarea4;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] palabras = new String[8];
        String[] colores = {};
        String[] otros = {};


        for (int i = 0; i < palabras.length; i++) {
            System.out.println("Introduce la Palabra en la Posición " + i + ":");
            palabras[i] = sc.nextLine();

            if (esColor(palabras[i])) {
                colores = Arrays.copyOf(colores, colores.length+1);
                colores[colores.length - 1] = palabras[i];
            } else {
                otros = Arrays.copyOf(otros, otros.length+1);
                otros[otros.length - 1] = palabras[i];
            }
        }

        int tamano_inicial = colores.length;;
        colores = Arrays.copyOf(colores, colores.length+otros.length);

        for (int i = 0; i < otros.length; i++) {
            colores[tamano_inicial+i] = otros[i];
        }

        System.out.println(Arrays.toString(palabras));
        System.out.println(Arrays.toString(colores));
        System.out.println(Arrays.toString(otros));
    }

    public static boolean esColor(String palabra) {
        String[] listaColores = {"verde", "rojo", "azul", "amarillo", "naraja", "rosa", "negro", "blanco", "morado"};

        for (int i = 0; i < listaColores.length; i++) {
            if (listaColores[i].equalsIgnoreCase(palabra)) {
                return true;
            }
        }

        return false;
    }

}