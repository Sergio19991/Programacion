package com.sergiobejaranoarroyo.Unidad2.Tarea9;

import java.util.Scanner;

public class Actividad2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String contrasenaPrimerJugador, contrasenaSegundoJugador;

        System.out.print("El Primer Jugador debe introducir una Contraseña: ");
        contrasenaPrimerJugador = sc.next();

        System.out.println();

        System.out.println("Pistas:");
        System.out.println("   - Número de Caracteres: " + contrasenaPrimerJugador.length());
        System.out.println("   - Primera Letra: " + contrasenaPrimerJugador.charAt(0));
        System.out.println("   - última Letra: " + (contrasenaPrimerJugador.charAt(contrasenaPrimerJugador.length() - 1)));

        System.out.println();

        System.out.print("El Segundo Jugador debe adivinar la Contraseña: ");
        contrasenaSegundoJugador = sc.next();

        if (contrasenaPrimerJugador.equals(contrasenaSegundoJugador)) {
            System.out.println("Acertaste");
        } else {
            System.out.println("Fallaste");
        }
    }
}