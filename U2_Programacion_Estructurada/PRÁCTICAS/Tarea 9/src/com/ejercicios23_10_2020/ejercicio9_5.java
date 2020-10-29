package com.ejercicios23_10_2020;

import java.util.Scanner;

public class ejercicio9_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        String comienzo = "Javalín,javalón";
        String terminaciones = "javalén,len,len";


        System.out.println("Introduce la frase");
        frase = sc.nextLine();

        if (frase.length() > comienzo.length()) {
            //Si la frase empieza por lo "Javalín, javalón" o acaba como el dialecto
            String c = frase.substring(0, comienzo.length());
            String c2 = frase.substring(frase.length() - terminaciones.length(), frase.length());
            if (frase.substring(0, comienzo.length()).equals(comienzo)) {

                //Idioma oficial de Javalandia
                String resultado = frase.substring(comienzo.length(), frase.length()).trim();
                System.out.println("El mensaje real es:" + resultado);

            } else if (frase.substring(frase.length() - terminaciones.length(), frase.length()).equals(terminaciones)) {

                //Dialecto javalandia
                String result = frase.substring(0, frase.length() - 1 - terminaciones.length()).trim();
                System.out.println("El mensaje real es:" + result);
            } else {
                System.out.println("Esta frase no es del idioma correcto");
            }
        } else {
            System.out.println("Esta frase no es del idioma correcto");
        }
    }
}
