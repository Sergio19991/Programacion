package com.sergiobejaranoarroyo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Locale;
import java.util.Scanner;

public class Actividad4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        ObjectOutputStream out = null;

        try {
            System.out.println("Número de Elementos:");
            int n = sc.nextInt();

            double[] tabla = new double[n];
            out = new ObjectOutputStream(new FileOutputStream("binario_Actividad4.dat"));

            for (int i = 0; i < tabla.length; i++) {
                System.out.println("Introduce un Número:");
                tabla[i] = sc.nextDouble();
            }

            out.writeObject(tabla);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {

            }
        }
    }
}