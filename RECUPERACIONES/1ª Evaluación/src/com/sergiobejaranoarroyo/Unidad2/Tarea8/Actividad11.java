package com.sergiobejaranoarroyo.Unidad2.Tarea8;

public class Actividad11 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("\n" + "TABLA DEL " + i + ": ");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " X " + j + " = " + (i * j));
            }
        }
    }
}