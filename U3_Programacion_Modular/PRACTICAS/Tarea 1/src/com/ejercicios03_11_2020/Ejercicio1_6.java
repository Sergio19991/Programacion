package com.ejercicios03_11_2020;

import java.util.Scanner;

public class Ejercicio1_6 {
    public static void main(String[] args) {

        System.out.println(esVocal('A'));
    }

    public static boolean esVocal(char c) {
        String cadena = Character.toString(c);   //Devuelve la cadena establecida en la variable c de tipo cadena.
        cadena = cadena.toUpperCase();  //Devuelve el valor ocnvertido a mayúsculas.
        c = cadena.charAt(0);   //Se queda con el primer valor de la cadena.
        if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            return true;
        } else {
            return false;
        }
    }

}