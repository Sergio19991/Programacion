package com.sergiobejaranoarroyo;

import java.io.*;
import java.util.Scanner;

public class Actividad7 {
    public static void main(String[] args) throws ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        ObjectOutputStream out = null;
        ObjectInputStream in = null;

        try {
            System.out.println("Escribe una Frase:");
            String frase = sc.nextLine();
            out = new ObjectOutputStream(new FileOutputStream("binario_Actividad7.dat"));
            out.writeObject(frase);
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
            in = new ObjectInputStream(new FileInputStream("binario_Actividad7.dat"));
            System.out.println((String) in.readObject());
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