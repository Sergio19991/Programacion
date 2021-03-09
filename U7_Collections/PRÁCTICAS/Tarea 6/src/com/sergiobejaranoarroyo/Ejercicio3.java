package com.sergiobejaranoarroyo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> capitales = new HashMap<>();
        String pais, capital;

        capitales.put("España", "Madrid");
        capitales.put("Portugal", "Lisboa");
        capitales.put("Francia", "París");

        do {
            System.out.print("Escribe el nombre de un país y te diré su capital: ");
            pais = sc.nextLine();

            if (!pais.equals("salir")) {
                if (capitales.containsKey(pais)) {
                    System.out.println("La capital de " + pais + " es " + capitales.get(pais));
                } else {
                    System.out.print("No conozco la respuesta ¿cuál es la capital de " + pais + "?: ");
                    capital = sc.nextLine();
                    capitales.put(pais, capital);
                    System.out.println("Gracias por enseñarme nuevas capitales");
                }
            }
        } while (!pais.equals("salir"));

        System.out.println();
        System.out.println(capitales);
    }
}