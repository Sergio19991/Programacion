package com.sergiobejaranoarroyo.Unidad2.Tarea9;

import java.util.Scanner;

public class Actividad4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;

        System.out.print("Introduce una Frase: ");
        frase = sc.nextLine();

        if (frase.charAt((int) Math.floor(frase.length() / 2)) == ' ') {
            System.out.println("El Carácter del centro es un Espacio");
        } else {
            System.out.println("El Carácter del centro no es un Espacio");
        }
    }
}