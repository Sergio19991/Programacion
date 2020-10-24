package com.ejercicios15_10_2020;

import java.util.Scanner;

public class ejercicio8_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor_minimo, valor_maximo, rango, intercambio;

        System.out.println("Introduce el Valor Mínimo:");
        valor_minimo = sc.nextInt();
        System.out.println("Introduce el Valor Máximo:");
        valor_maximo = sc.nextInt();

        if (valor_maximo < valor_minimo) {
            intercambio = valor_minimo;
            valor_minimo = valor_maximo;
            valor_maximo = intercambio;
        }

        System.out.println(valor_minimo);
        System.out.println(valor_maximo);

        System.out.println("Introduce el Número:");
        rango = sc.nextInt();

        while ((rango>valor_maximo) || (rango<valor_minimo)) {
            System.out.println("Introduce el Número:");
            rango = sc.nextInt();
        }
    }
}
