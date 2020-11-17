package com.sergiobejaranaorroyo.Tarea2;

import java.util.Scanner;

public class Actividad2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        int numespacios = 0;

        System.out.println("Introduce la frase:");
        frase = sc.nextLine();

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                numespacios++;
            }
        }

        System.out.println("Hay " + numespacios + " espacios.");
    }

}