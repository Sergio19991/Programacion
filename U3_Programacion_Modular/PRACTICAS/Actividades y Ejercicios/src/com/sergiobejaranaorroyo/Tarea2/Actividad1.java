package com.sergiobejaranaorroyo.Tarea2;

import java.util.Scanner;

public class Actividad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra;
        StringBuilder frase;

        frase = new StringBuilder();

        do {
            System.out.println("Introduce palabra:");
            palabra = sc.nextLine();
            if (!palabra.equals("fin")) {
                frase.append(" ").append(palabra);
            }
        } while (!palabra.equals("fin"));

        System.out.println(frase + ".");
    }

}