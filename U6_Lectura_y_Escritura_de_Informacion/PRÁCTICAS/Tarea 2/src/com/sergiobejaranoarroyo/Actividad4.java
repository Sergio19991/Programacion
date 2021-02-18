package com.sergiobejaranoarroyo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Actividad4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nEnteros;
        double[] nDecimales;

        ObjectOutputStream out = null;
        ObjectInputStream in = null;

        System.out.println("Introduce un Número:");
        nEnteros = sc.nextInt();

        for (int i = 0; i < nEnteros; i++) {
            try {
                out = new ObjectOutputStream(new FileOutputStream("binario_Actividad4.dat"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
