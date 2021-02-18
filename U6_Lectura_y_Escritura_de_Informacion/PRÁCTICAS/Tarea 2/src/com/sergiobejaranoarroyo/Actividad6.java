package com.sergiobejaranoarroyo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Actividad6 {
    public static void main(String[] args) {
        ObjectInputStream in = null;

        try {
            in = new ObjectInputStream(new FileInputStream("binario_Actividad6.dat"));

            try {
                while (true) {
                    System.out.println(in.readDouble());
                }
            } catch (IOException e) {

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