package com.sergiobejaranoarroyo;

import java.io.*;
import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerosUsuario, contador = 0;

        ObjectOutputStream out = null;
        ObjectInputStream in = null;

        try {
            out = new ObjectOutputStream(new FileOutputStream("binario_Actividad3.dat"));
            System.out.println("Introduce un Número Entero Positivo:");
            numerosUsuario = sc.nextInt();

            while (numerosUsuario >= 0) {
                contador++;
                out.writeInt(numerosUsuario);
                System.out.println("Introduce un Número Entero Positivo:");
                numerosUsuario = sc.nextInt();
            }
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

        try {
            in = new ObjectInputStream(new FileInputStream("binario_Actividad3.dat"));
            for (int i = 0; i < contador; i++) {
                numerosUsuario = in.readInt();
                System.out.println(numerosUsuario);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
            }
        }
    }
}