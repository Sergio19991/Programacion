package com.sergiobejaranoarroyo;

import java.util.ArrayList;
import java.util.Scanner;

public class Actividad4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase = "";

        System.out.println("Introduce una Frase:");
        frase = sc.nextLine();

        String[] palabras = frase.split(" ");
        ArrayList<String> words = new ArrayList<>();
        ArrayList<String> repetidas = new ArrayList<>();
        ArrayList<String> sinRepetir = new ArrayList<>();

        for (int i = 0; i < palabras.length; i++) {
            words.add(palabras[i]);
        }

        for (String palabra : words) {
            if (words.indexOf(palabra) != words.lastIndexOf(palabra)) {
                repetidas.add(palabra);
            } else {
                sinRepetir.add(palabra);
            }

        }
        System.out.println();

        System.out.println("Frase por Defecto:");
        System.out.println(words);
        System.out.println();

        System.out.println("Palabras Repetidas:");
        System.out.println(repetidas);
        System.out.println();

        System.out.println("Palabras sin Repetir:");
        System.out.println(sinRepetir);
    }
}