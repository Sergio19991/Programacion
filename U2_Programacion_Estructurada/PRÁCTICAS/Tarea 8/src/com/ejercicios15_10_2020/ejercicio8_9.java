package com.ejercicios15_10_2020;

import java.util.Scanner;

public class ejercicio8_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura_maxima, etiqueta, altura, contador;

        altura_maxima = 0;
        contador = 1;
        etiqueta = 0;

        do {
            System.out.println("Introduce la Altura del Árbol");
            altura = sc.nextInt();

            if (altura>altura_maxima) {
                altura_maxima = altura;
                etiqueta = contador;
            }

            contador++;
        } while (altura!=-1);

        System.out.println("La altura máxima es " + altura_maxima + "cm, cuyo árbol es el " + etiqueta + ".");
    }
}

