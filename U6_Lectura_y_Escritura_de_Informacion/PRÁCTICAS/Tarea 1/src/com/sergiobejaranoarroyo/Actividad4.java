package com.sergiobejaranoarroyo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Actividad4 {
    public static void main(String[] args) {
        try {
            BufferedReader f = new BufferedReader(new FileReader("carta.txt"));

            int contadorCaracteres = 0, contadorPalabras = 0, contadorlineas = 0;

            int c = f.read();

            while (c != -1) {
                if ((char) c == ' ') {
                    contadorCaracteres++;
                    contadorPalabras++;
                } else {
                    if ((char) c == '\n') {
                        contadorPalabras++;
                        contadorlineas++;
                    } else {
                        contadorCaracteres++;
                    }
                }

                c = f.read();
            }

            f.close();

            if (contadorPalabras > 0) {
                contadorPalabras++;
            }

            if (contadorlineas > 0) {
                contadorlineas++;
            }

            System.out.println("Hay " + (contadorCaracteres - 1) + " Caracteres.");
            System.out.println("Hay " + contadorPalabras + " Palabras.");
            System.out.println("Hay " + contadorlineas + " Líneas.");
        } catch (IOException ex) {
            System.out.println("ERROR");
        }
    }
}