package com.ejercicios23_10_2020;

import java.util.Scanner;

public class ejercicio9_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String contrasena, adivinar;

        System.out.println(" -------------------------------- ");
        System.out.println(" ----- ACIERTA LA CONTASEÑA ----- ");
        System.out.println(" -------------------------------- ");
        System.out.println(" ");

        System.out.println("El Primer Jugador debe insertar la Contraseña:");
        contrasena = sc.nextLine();
        System.out.println(" ");

        System.out.println("Pistas:");
        System.out.println("   -Número de Caracteres: " + contrasena.length());
        System.out.println("   -Primera letra: " + contrasena.charAt(0));
        System.out.println("   -Última letra: ");
        System.out.println("");

        System.out.println("El Segundo Jugador deber Adivinar la contraseña. Puedes tener en cuenta las pistas anteriores:");
        adivinar = sc.nextLine();
        System.out.println(" ");

        if (contrasena.equals(adivinar)) {
            System.out.println("Acertaste");
        } else {
            System.out.println("Fallaste");
        }
    }
}
