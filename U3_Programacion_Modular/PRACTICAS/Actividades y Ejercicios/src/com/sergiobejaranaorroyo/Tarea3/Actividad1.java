package com.sergiobejaranaorroyo.Tarea3;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double[] numeros_decimales = new Double[5];
        int i;

        for (i = 0; i < numeros_decimales.length; i++) {
            System.out.println("Introduce Número Decimal:");
            numeros_decimales[i] = sc.nextDouble();
        }

        for (i = 0; i < numeros_decimales.length; i++) {
            System.out.println("La posición " + i + " es " + numeros_decimales[i]);
        }

        System.out.println(Arrays.toString(numeros_decimales));
    }

}