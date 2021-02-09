package com.sergiobejaranoarroyo;

import java.io.*;
import java.util.Scanner;

public class Actividad6 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Mostrar Libro de Firmas.");
        System.out.println("2. Añadir Nombre.");
        System.out.println();
        System.out.print("Introduce una Opción: ");
        int opcion = sc.nextInt();
        sc.nextLine();
        System.out.println();

        switch (opcion) {
            case 1:
                muestraFicheroFirma();
                break;
            case 2:
                System.out.println("Introduce el Nombre:");
                String nombre = sc.nextLine();
                insertarNuevaFirma(nombre);
                break;
        }
    }

    static void muestraFicheroFirma() throws IOException {
        try {
            BufferedReader entr = new BufferedReader(new FileReader("firmas.txt"));
            String linea = entr.readLine();

            while (linea != null) {
                System.out.println(linea);
                linea = entr.readLine();
            }

            entr.close();
        } catch (EOFException eof) {
            System.out.println("Error de Fichero.");
        } catch (FileNotFoundException fnf) {
            System.out.println("No se encuentra el Fichero.");
        }
    }

    static void insertarNuevaFirma(String nuevo) throws IOException {
        try {
            BufferedReader entr = new BufferedReader(new FileReader("firmas.txt"));

            String nombre = entr.readLine();

            boolean encontrado = false;

            while (nombre != null && encontrado == false) {
                if (nombre.equals(nuevo)) {
                    encontrado = true;
                }

                nombre = entr.readLine();
            }

            entr.close();

            if (encontrado == false) {
                BufferedWriter firma = new BufferedWriter(new FileWriter("firmas.txt", true));

                firma.newLine();

                firma.write(nuevo);

                System.out.println("\nNuevo Nombre insertado.");

                firma.close();
            } else {
                System.out.println("\nYa había Firmado.");
            }
        } catch (EOFException eof) {
            System.out.println("Error de Fichero.");
        } catch (FileNotFoundException fnf) {
            System.out.println("No se encuentra el Fichero.");
        }
    }
}