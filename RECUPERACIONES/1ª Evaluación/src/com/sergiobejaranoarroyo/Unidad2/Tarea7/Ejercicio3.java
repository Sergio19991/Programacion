package com.sergiobejaranoarroyo.Unidad2.Tarea7;

public class Ejercicio3 {
    public static void main(String[] args) {
        int letra;

        letra = (int) (Math.random() * (122 - 97 + 1) + 97);

        System.out.println("El Código " + letra + " corresponde a la Letra " + (char) letra);
    }
}