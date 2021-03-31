package com.sergiobejaranoarroyo.Unidad2.Tarea8;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minimo, maximo, intercambio, valor;

        System.out.print("Introduce el Mínimo: ");
        minimo = sc.nextInt();
        System.out.print("Introduce el Máximo: ");
        maximo = sc.nextInt();

        /** Intercambiamos los valores para que se cunmpla el Mínimo y el Máximo siempre, en el caso de que el Usuario no lo inserte correctamente: **/
        if (maximo < minimo) {
            intercambio = minimo;
            minimo = maximo;
            maximo = intercambio;
        }

        System.out.println();

        System.out.print("Introduce un Valor entre " + minimo + " y " + maximo + ": ");
        valor = sc.nextInt();

        while ((valor > maximo) || (valor < minimo)) {
            System.out.print("Introduce un Valor entre " + minimo + " y " + maximo + ": ");
            valor = sc.nextInt();
        }
    }
}