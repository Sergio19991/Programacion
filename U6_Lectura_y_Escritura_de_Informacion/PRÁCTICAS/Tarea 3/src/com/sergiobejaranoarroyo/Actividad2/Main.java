package com.sergiobejaranoarroyo.Actividad2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /** Estableciendo una Variable para la fecha ("fecha") y su formato  (fechaHora = "HH:mm:ss - dd/MM/yyyy"): **/
        Date fecha = new Date();
        DateFormat fechaHora = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");

        String error = "";

        String nombre, apellidos, dni = null;
        int edad = 0;

        /** CLIENTE 1: **/
        try {
            Cliente cliente1 = new Cliente("CLIENTE 1", "APELLIDOS 1", 20, "132465978-A");
        } catch (EdadErroneaException e) {
            e.printStackTrace();

            try {
                BufferedWriter out = new BufferedWriter(new FileWriter(fecha + ".log"));
                for (int i = 0; i < error.length(); i++) {
                    out.write(error.charAt(i));
                }
                out.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            error = fechaHora + " - EX001 - " + e.getClass() + ": Imposible crear el usuario con dni " + dni + ". La edad mo puede ser negativa " + "\n" + "(Edad indicada: " + edad + ").";

        } catch (MenorEdadException e) {


            try {
                BufferedWriter out = new BufferedWriter(new FileWriter(fecha + ".log"));
                for (int i = 0; i < error.length(); i++) {
                    out.write(error.charAt(i));
                }
                out.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            error = fechaHora + " - EX002 - " + e.getClass() + ": Imposible crear el usuario con dni " + dni + ". La edad mo puede ser negativa " + "\n" + "(Edad indicada: " + edad + ").";
            e.printStackTrace();
        }

        /** CLIENTE 2: **/
        try {
            Cliente cliente2 = new Cliente("CLIENTE 2", "APELLIDOS 2", 110, "978465321-B");
        } catch (EdadErroneaException e) {
            e.printStackTrace();


            try {
                BufferedWriter out = new BufferedWriter(new FileWriter(fecha + ".log"));
                for (int i = 0; i < error.length(); i++) {
                    out.write(error.charAt(i));
                }
                out.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            error = fechaHora + " - EX001 - " + e.getClass() + ": Imposible crear el usuario con dni " + dni + ". La edad mo puede ser negativa " + "\n" + "(Edad indicada: " + edad + ").";
        } catch (MenorEdadException e) {
            e.printStackTrace();


            try {
                BufferedWriter out = new BufferedWriter(new FileWriter(fecha + ".log"));
                for (int i = 0; i < error.length(); i++) {
                    out.write(error.charAt(i));
                }
                out.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            error = fechaHora + " - EX002 - " + e.getClass() + ": Imposible crear el usuario con dni " + dni + ". La edad mo puede ser negativa " + "\n" + "(Edad indicada: " + edad + ").";
        }

        /** CLIENTE 3: **/
        try {
            Cliente cliente3 = new Cliente("CLIENTE 3", "APELLIDOS 3", 12, "465789132-C");
        } catch (EdadErroneaException e) {
            e.printStackTrace();


            try {
                BufferedWriter out = new BufferedWriter(new FileWriter(fecha + ".log"));
                for (int i = 0; i < error.length(); i++) {
                    out.write(error.charAt(i));
                }
                out.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            error = fechaHora + " - EX001 - " + e.getClass() + ": Imposible crear el usuario con dni " + dni + ". La edad mo puede ser negativa " + "\n" + "(Edad indicada: " + edad + ").";
        } catch (MenorEdadException e) {
            e.printStackTrace();


            try {
                BufferedWriter out = new BufferedWriter(new FileWriter(fecha + ".log"));
                for (int i = 0; i < error.length(); i++) {
                    out.write(error.charAt(i));
                }
                out.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            error = fechaHora + " - EX002 - " + e.getClass() + ": Imposible crear el usuario con dni " + dni + ". La edad mo puede ser negativa " + "\n" + "(Edad indicada: " + edad + ").";
        }

    }
}