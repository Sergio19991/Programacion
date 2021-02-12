package com.sergiobejaranoarroyo;

import java.io.*;


public class Actividad5 {
    public static void main(String[] args) {
        int menor = 0, mayor = 0;
        String linea;
        boolean priemeraLinea = true;

        try {
            BufferedReader bin = new BufferedReader(new FileReader("numeros.txt"));

            linea = bin.readLine();
            while (linea != null) {
                int numero = Integer.valueOf(linea);

                if (priemeraLinea) {
                    menor = numero;
                    mayor = numero;
                    priemeraLinea = false;
                } else {
                    if (numero > mayor) mayor = numero;
                    if (numero < menor) menor = numero;
                }

                linea = bin.readLine();
            }

            bin.close();
            System.out.println("MAYOR: " + mayor);
            System.out.println("MENOR: " + menor);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}