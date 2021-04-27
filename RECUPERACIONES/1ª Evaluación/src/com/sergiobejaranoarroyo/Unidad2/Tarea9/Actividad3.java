package com.sergiobejaranoarroyo.Unidad2.Tarea9;

import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {
        System.out.println("* * * * * * * * * * * * *");
        System.out.println("* ACIERTA LA CONTRASEÑA *");
        System.out.println("* * * * * * * * * * * * *");

        System.out.println();

        Scanner sc = new Scanner(System.in);
        String contrasenaPrimerJugador, contrasenaSegundoJugador;

        System.out.print("El Primer Jugador debe introducir una Contraseña: ");
        contrasenaPrimerJugador = sc.next();

        System.out.println();

        System.out.println("PISTAS:");
        System.out.println("   · Número de Caracteres: " + contrasenaPrimerJugador.length());
        System.out.println("   · Primera Letra: " + contrasenaPrimerJugador.charAt(0));
        System.out.println("   · última Letra: " + (contrasenaPrimerJugador.charAt(contrasenaPrimerJugador.length() - 1)));

        System.out.println();

        System.out.print("El Segundo Jugador debe adiviniar la Contraseña: ");
        contrasenaSegundoJugador = sc.next();

        System.out.println();

        if (contrasenaPrimerJugador.equals(contrasenaSegundoJugador)) {
            System.out.println("Acertaste");
        } else if (contrasenaSegundoJugador.length() > contrasenaPrimerJugador.length()) {
            System.out.println("Menor");
        } else {
            System.out.println("Mayor");
        }
    }
}