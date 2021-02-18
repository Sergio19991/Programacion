package com.sergiobejaranoarroyo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class Actividad5 {
    public static void main(String[] args) throws ClassNotFoundException {
        ObjectInputStream in = null;

        try {
            in = new ObjectInputStream(new FileInputStream("binario_Actividad5.dat"));
            double[] tabla = (double[]) in.readObject();
            System.out.println(Arrays.toString(tabla));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}