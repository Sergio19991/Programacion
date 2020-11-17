package com.sergiobejaranaorroyo.Tarea1;

public class Actividad6 {
    public static void main(String[] args) {

        System.out.println(esVocal('A'));
    }

    public static boolean esVocal(char c) {
        String cadena = Character.toString(c);
        cadena = cadena.toUpperCase();
        c = cadena.charAt(0);
        return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

}