package com.ejercicios23_10_2020;

import java.util.Scanner;

public class ejercicio9_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;

        System.out.println("Introduce una Frase:");
        frase = sc.nextLine();

        if (frase.charAt((int)Math.floor(frase.length()/2))==' ') {
            System.out.println("El Carácter del centro es un Espacio.");
        } else {
            System.out.println("El Carácter del centro no es un Espacio.");
        }
    }
}
