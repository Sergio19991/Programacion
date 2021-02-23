package com.sergiobejaranoarroyo;

import java.util.ArrayList;
import java.util.Scanner;

public class Actividad6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombres = "";
        String terminar = "fin";

        ArrayList<String> listaNombres = new ArrayList<>();

        while (nombres==terminar){
            System.out.println("Introduce un Nombre:");
            nombres = sc.nextLine();

            String[] palabras = nombres.split(" ");

            for (int i = 0; i < palabras.length; i++) {
                listaNombres.add(palabras[i]);
            }

        }

        System.out.println(listaNombres);
    }
}
