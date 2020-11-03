package com.ejercicios03_11_2020;

public class otro_ejercicio {
    public static void main(String[] args) {

        System.out.println(mayor2(6,9));

        System.out.println(mayor3(9, 1, 34));

        System.out.println(esVocal('A'));

        System.out.println(esVocal('s'));

        System.out.println(esVocal('h'));
    }

    public static int mayor2(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static int mayor3(int a, int b, int c) {
        if (mayor2(a,b)>c) {
            return mayor2(a,b);
        } else {
            return c;
        }
    }

    public static boolean esVocal(char c) {
        String cadena = Character.toString(c);
        cadena = cadena.toUpperCase();
        c = cadena.charAt(0);
        if (c=='A' || c=='E' | c=='I' | c=='O' | c=='U') {
            return true;
        } else {
            return false;
        }
    }

}