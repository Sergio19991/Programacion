package com.sergiobejaranoarroyo;

import java.io.*;
import java.util.Scanner;

public class Actividad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numeroUsuario;

        System.out.println("Introduce un Número Decimal:");
        numeroUsuario = sc.nextDouble();

        try {
            ObjectOutputStream flujoSalida = new ObjectOutputStream(new FileOutputStream("binario_Actividad1.dat"));
            flujoSalida.writeDouble(numeroUsuario);
            flujoSalida.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}