package com.ejercicios15_10_2020;

public class ejercicio7_3 {
    public static void main(String[] args) {
        int caracter;

        caracter = (int) (Math.random()*(123-97))+97;  //Genera un número del rango entre 97 y 122 (ambos inlcuidos)

        System.out.println("El código carácter "+ caracter + " corresponde a la letra " + (char)caracter);
    }
}
