package com.sergiobejaranaorroyo.Tarea2;

import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        StringBuilder resultado = new StringBuilder();
        int i;

        System.out.println("Introduce una Frase:");
        frase = sc.nextLine();

        for (i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) != 'a' && frase.charAt(i) != 'e' && frase.charAt(i) != 'i' && frase.charAt(i) != 'o' && frase.charAt(i) != 'u'
                    && frase.charAt(i) != 'á' && frase.charAt(i) != 'é' && frase.charAt(i) != 'í' && frase.charAt(i) != 'ó' && frase.charAt(i) != 'ú'
                    && frase.charAt(i) != 'A' && frase.charAt(i) != 'E' && frase.charAt(i) != 'I' && frase.charAt(i) != 'O' && frase.charAt(i) != 'U'
                    && frase.charAt(i) != 'Á' && frase.charAt(i) != 'É' && frase.charAt(i) != 'Í' && frase.charAt(i) != 'Ó' && frase.charAt(i) != 'Ú') {
                resultado.append(frase.charAt(i));
            }
        }
        System.out.println(resultado);
    }

}