package com.sergiobejaranoarroyo.Tarea1_INCOMPLETO_HechoEnClase;

import java.util.Arrays;

public class Texto {
    int logitudMAxima;
    char[] cadena;

    public Texto(int logitudMAxima) {
        this.logitudMAxima = logitudMAxima;
        this.cadena = new char[0];
    }

    public boolean anadirFinal(char c) {
        if (this.cadena.length + 1 > logitudMAxima) {
            System.out.println("Cadena completa.");
            return false;
        } else {
            this.cadena = Arrays.copyOf(cadena, cadena.length + 1);
            this.cadena[cadena.length - 1] = c;
            return true;
        }
    }

    public boolean anadirPrincipio(char c) {
        if (this.cadena.length + 1 > logitudMAxima) {
            System.out.println("Cadena completa.");
            return false;
        } else {
            char[] aux = new char[cadena.length + 1];
            aux[0] = c;

            for (int i = 0; i < cadena.length; i++) {
                aux[i + 1] = cadena[i];
            }

            this.cadena = aux;
            return true;
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(cadena);
    }
}