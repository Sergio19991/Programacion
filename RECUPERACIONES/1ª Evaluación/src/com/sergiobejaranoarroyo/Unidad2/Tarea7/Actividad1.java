package com.sergiobejaranoarroyo.Unidad2.Tarea7;

import java.util.Scanner;

public class Actividad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 5;
        int b = 10;
        int intercambio;

        intercambio = a;
        a = b;
        b = intercambio;

        System.out.println("Valor de a: " + a);
        System.out.println("Valor de b: " + b);
    }
}