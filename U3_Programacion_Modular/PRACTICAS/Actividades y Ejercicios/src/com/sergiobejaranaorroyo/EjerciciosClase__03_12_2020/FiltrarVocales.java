package com.sergiobejaranaorroyo.EjerciciosClase__03_12_2020;

import java.util.Arrays;
import java.util.Scanner;

public class FiltrarVocales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] origen = new String[10];
        String[] destino = {};
        int numeroLeidas = 0;
        String cadena;

        while (numeroLeidas < origen.length) {
            System.out.println("Introduce la Cadena:");
            cadena = sc.nextLine();
            if (cadena.length() == 1 && cadena.charAt(0) >= 'a' && cadena.charAt(0) <= 'z') {
                origen[numeroLeidas] = cadena;
                numeroLeidas++;
            }
        }

        System.out.println(Arrays.toString(origen));

        for (String c : origen) {
            char ch = c.charAt(0);
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                destino = Arrays.copyOf(destino, destino.length + 1);
                destino[destino.length - 1] = c;
            }
        }

        System.out.println(Arrays.toString(destino));
    }
}