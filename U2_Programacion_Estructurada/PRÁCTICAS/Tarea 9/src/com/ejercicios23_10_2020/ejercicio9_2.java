package com.ejercicios23_10_2020;

import java.util.Scanner;

public class ejercicio9_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String contrasena, adivinar;

        System.out.println(" -------------------------------- ");   //
        System.out.println(" ----- ACIERTA LA CONTASEÑA ----- ");   //Estética de cara al Usuario.
        System.out.println(" -------------------------------- ");   //
        System.out.println(" ");   //Salto de línea,

        System.out.println("El Primer Jugador debe insertar la Contraseña:");
        contrasena = sc.nextLine();
        System.out.println(" ");   //Salto de línea

        System.out.println("Pistas:");
        System.out.println("   -Número de Caracteres: " + contrasena.length());   //Muestro la longitud de la cadena.
        System.out.println("   -Primera letra: " + contrasena.charAt(0));   //Muestro el primer caracter de la cadena establecida con la vairable "contrasena".
        System.out.println("   -Última letra: " + contrasena.charAt(contrasena.length()-1));   //Muestro el último caracter de la cadena establecida en la variable "contrasena".
        System.out.println("");                                                                //"contrasena" valdrá lo que el usuario escriba.

        System.out.println("El Segundo Jugador deber Adivinar la contraseña. Puedes tener en cuenta las pistas anteriores:");
        adivinar = sc.nextLine();
        System.out.println(" ");   //Salto de línea

        if (contrasena.equals(adivinar)) {
            System.out.println("Acertaste");
        } else {
            System.out.println("Fallaste");
        }
    }
}
