package com.ejercicios03_11_2020;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio1_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Introduce la Base:");
        double base = sc.nextDouble();
        System.out.println("Introduce el Exponente:");
        int exp = sc.nextInt();

        double res = aElevadoN(base, exp);
        System.out.println(base + " elevado a " + exp + " = " + res);   //Solución Iterativa.
        /**System.out.println("El resultado es " + aElevadoN(base, exp));**/   //Solución Recursiva.
    }

    /**
     * SOLUCIÓN ITERATIVA
     **/
    static double aElevadoN(double a, int n) {
        double res = 1;

        if (n == 0) {
            res = 1;
        } else {
            for (int i = 1; i <= n; i++) {
                res = res * a;
            }
        }
        return (res);
    }

    /**
     * SOLUCIÓN RECURSIVA
     ***/
    /**static double aElevadoN(double a, int n) {
        double res;

        if (n == 0) {
            res = 1;
        } else {
            res = a * aElevadoN(a, n - 1);
        }
        return (res);
    }**/

}