package com.sergiobejaranoarroyo;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Actividad14 {
    public static void main(String[] args) {
        System.out.println(leeCadena());
    }

    public static List<Character> leeCadena() {
        List resultado = new LinkedList();

        String frase;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la Cadena:");
        frase = sc.nextLine();

        for (int i = 0; i < frase.length(); i++) {
            resultado.add(frase.charAt(i));
        }

        return resultado;
    }
}