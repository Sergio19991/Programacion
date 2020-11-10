package com.ejercicio06_11_2020;

import java.util.Scanner;

public class Actividad2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra, frase;

        frase = "";

        do {
            System.out.println("Introduce palabra:");
            palabra = sc.nextLine();
            if (!palabra.equals("fin")) {
                frase += " " + palabra;
            }
        } while (!palabra.equals("fin"));

        System.out.println(frase + ".");
    }
}