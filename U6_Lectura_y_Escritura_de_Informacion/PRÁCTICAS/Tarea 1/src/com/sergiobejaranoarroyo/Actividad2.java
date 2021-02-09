package com.sergiobejaranoarroyo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Actividad2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre, edad;

        System.out.println("introduce tu Nombre:");
        nombre = "NOMBRE: " + sc.nextLine();
        System.out.println("Introduce tus Edad:");
        edad = "EDAD: " + sc.nextLine();

        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("datos.txt"));
            String cad = nombre;
            for (int i = 0; i < cad.length(); i++) {
                out.write(cad.charAt(i));
            }
            cad = edad;
            out.newLine();
            out.write(cad);
            out.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}