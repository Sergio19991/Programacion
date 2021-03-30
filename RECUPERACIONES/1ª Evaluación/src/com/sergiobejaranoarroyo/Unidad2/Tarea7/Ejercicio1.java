package com.sergiobejaranoarroyo.Unidad2.Tarea7;

public class Ejercicio1 {
    public static void main(String[] args) {
        int a, b, auxiliar;

        a = 5;
        b = 10;

        auxiliar = a;
        a = b;
        b = auxiliar;

        System.out.println(a);
        System.out.println();
        System.out.println(b);
    }
}