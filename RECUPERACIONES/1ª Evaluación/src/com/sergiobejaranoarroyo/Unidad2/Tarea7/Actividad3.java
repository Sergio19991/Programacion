package com.sergiobejaranoarroyo.Unidad2.Tarea7;

public class Actividad3 {
    public static void main(String[] args) {
        int ascii = (int) (Math.random() * (122 - 97) + 97);

        System.out.println("El Código ASCII " + ascii + " corresponde a la Letra " + (char) ascii);
    }
}