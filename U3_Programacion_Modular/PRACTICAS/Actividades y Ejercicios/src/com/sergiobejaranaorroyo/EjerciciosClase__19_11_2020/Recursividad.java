package com.sergiobejaranaorroyo.EjerciciosClase__19_11_2020;

public class Recursividad {
    public static void main(String[] args) {
        System.out.println("El Factorial de 6, es " + factorial(6));
        System.out.println("El Factorial de 7, es " + factorial(7));
    }

    public static int factorial(int num) {
        int resultado;
        if (num == 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }

}