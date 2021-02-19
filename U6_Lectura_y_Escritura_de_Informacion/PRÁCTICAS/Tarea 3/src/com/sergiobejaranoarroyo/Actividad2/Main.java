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
        Date fecha = new Date();
        DateFormat fechaHora = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        System.out.println(fechaHora);
        System.out.println(fecha);
        String error = "";

        String nombre, apellidos, dni = null;
        int edad = 0;/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los Datos:");
        System.out.print("Nombre: ");
        nombre = sc.nextLine();
        System.out.print("Apellidos: ");
        apellidos = sc.nextLine();
        System.out.print("Edad: ");
        edad = sc.nextInt();
        System.out.print("DNI: ");
        dni = sc.nextLine();

        try {
            Cliente cliente = new Cliente(nombre, apellidos, edad, dni);
        } catch (EdadErroneaException e) {
            e.printStackTrace();

            try {
                BufferedWriter out = new BufferedWriter(new FileWriter(fechaHora + ".log"));
                String error = fechaHora + " - EX001 - " + e.getClass() + ": Imposible crear el usuario con dni " + dni + ". La edad mo puede ser negativa " + "\n" + "(Edad indicada: " + edad + ").";
                for (int i = 0; i < error.length(); i++) {
                    out.write(error.charAt(i));
                }
                out.close();
            } catch (IOException ioException) {
                ioException.getMessage();
            }

        } catch (MenorEdadException e) {
            e.printStackTrace();

            try {
                BufferedWriter out = new BufferedWriter(new FileWriter(fechaHora + ".log"));
                String error = fechaHora + " - EX001 - " + e.getClass() + ": Imposible crear el usuario con dni " + dni + ". La edad mo puede ser negativa " + "\n" + "(Edad indicada: " + edad + ").";
                for (int i = 0; i < error.length(); i++) {
                    out.write(error.charAt(i));
                }
                out.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }*/


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
            error = fechaHora + " - EX001 - " + e.getClass() + ": Imposible crear el usuario con dni " + dni + ". La edad mo puede ser negativa " + "\n" + "(Edad indicada: " + edad + ").";
            e.printStackTrace();
        }

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
            error = fechaHora + " - EX001 - " + e.getClass() + ": Imposible crear el usuario con dni " + dni + ". La edad mo puede ser negativa " + "\n" + "(Edad indicada: " + edad + ").";
        }

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
            error = fechaHora + " - EX001 - " + e.getClass() + ": Imposible crear el usuario con dni " + dni + ". La edad mo puede ser negativa " + "\n" + "(Edad indicada: " + edad + ").";
        }

    }
}