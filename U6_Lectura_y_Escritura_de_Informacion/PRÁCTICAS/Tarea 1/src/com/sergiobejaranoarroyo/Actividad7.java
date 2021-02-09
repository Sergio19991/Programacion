package com.sergiobejaranoarroyo;

import java.io.*;
import java.util.Scanner;

public class Actividad7 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        final int parar = 24;
        int contador = 0;

        try {
            BufferedReader entrada = new BufferedReader(new FileReader("more.txt"));

            String linea = entrada.readLine();

            while (linea != null) {
                System.out.println(linea);
                contador++;

                if (contador == parar) {
                    System.out.println();
                    System.out.println("Pulse Intro...");
                    sc.nextLine();
                    System.out.println();
                    contador = 0;
                }

                linea = entrada.readLine();
            }

            entrada.close();
        } catch (EOFException eof) {
            System.out.println("Error de Fichero.");
        } catch (FileNotFoundException fnf) {
            System.out.println("Fichero no Encontrador.");
        }
    }
}