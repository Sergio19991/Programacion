package com.sergiobejaranoarroyo;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Actividad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String defecto = "";
        String ficheroUsuario;
        String texto = "";

        System.out.println("Introduce el Nombre del Fichero:");
        ficheroUsuario = sc.nextLine();

        if (ficheroUsuario.equals(defecto)) {
            try {
                FileReader in = new FileReader("prueba.txt");

                int c = in.read();
                while (c != -1) {
                    texto += (char) c;
                    c = in.read();
                }
                in.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
            System.out.println(texto);
        } else {
            try {
                FileReader in = new FileReader(ficheroUsuario);

                int c = in.read();
                while (c != -1) {
                    texto += (char) c;
                    c = in.read();
                }
                in.close();
            } catch (IOException ex) {
                System.out.println("El Fichero " + ficheroUsuario + " no existe.");
            }
            System.out.println(texto);
        }
    }
}