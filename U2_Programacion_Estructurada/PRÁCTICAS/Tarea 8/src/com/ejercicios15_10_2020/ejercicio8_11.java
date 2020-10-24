package com.ejercicios15_10_2020;

public class ejercicio8_11 {
    public static void main(String[] args) {
        int i, j;

        for (i=1 ; i<=10 ; i++) {
            System.out.println(" ");
            System.out.println("TABLA DEL " + i + ":");
            for (j=1 ; j<=10 ; j++) {
                System.out.println(i + " X " + j + " = " + (i*j));
            }
        }
    }
}
