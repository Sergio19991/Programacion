package com.sergiobejaranoarroyo;

import java.io.*;
import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {
        /** SOLUCIÓN 1: **/
        try {
            BufferedReader f1 = new BufferedReader(new FileReader("original.txt"));
            BufferedWriter f2 = new BufferedWriter(new FileWriter("copia.txt"));

            int c = f1.read();

            while (c != -1) {
                f2.write(c);
                c = f1.read();
            }

            f1.close();
            f2.close();
        } catch (IOException ex) {
            System.out.println("Error de Fichero.");
        }


        /** SOLUCIÓN 2: **/
        Scanner sc = new Scanner(System.in);

        System.out.println("Ficher Fuente:");
        String fuente = sc.nextLine();

        String destino = nombreFichero(fuente);

        try {
            BufferedReader f1 = new BufferedReader(new FileReader(fuente));
            BufferedWriter f2 = new BufferedWriter(new FileWriter(destino));

            int c = f1.read();

            while (c != -1) {
                f2.write(c);
                c = f1.read();
            }

            f1.close();
            f2.close();
        } catch (IOException ex) {
            System.out.println("Error de Fichero.");
        }
    }

    static String nombreFichero(String nombre) {
        String nuevoNombre = "";

        int posicion = nombre.lastIndexOf('/');

        if (posicion == -1) {
            nuevoNombre = "copia_de_" + nombre.substring(posicion + 1);
        }

        return (nuevoNombre);
    }
}