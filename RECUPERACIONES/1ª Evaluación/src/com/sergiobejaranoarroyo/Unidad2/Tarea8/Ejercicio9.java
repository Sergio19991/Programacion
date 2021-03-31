package com.sergiobejaranoarroyo.Unidad2.Tarea8;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura, alturaMaxima = 0, contador = 0, etiqueta = 0;

        do {
            System.out.print("Introduce la Altura del Árbol: ");
            altura = sc.nextInt();

            if (altura > alturaMaxima) {
                alturaMaxima = altura;
                etiqueta = contador;
            }

            contador++;
        } while (altura != -1);

        System.out.println("La altura máxima es " + alturaMaxima + "cm, cuyo árbol es el " + etiqueta + ".");
    }
}