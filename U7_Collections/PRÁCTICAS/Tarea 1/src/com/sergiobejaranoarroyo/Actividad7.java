package com.sergiobejaranoarroyo;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Actividad7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> nombres = new TreeSet<>();

        System.out.print("Introducir nombre (\"fin\" para terminar): ");
        String temp = sc.nextLine();

        while (!temp.equalsIgnoreCase("fin")) {
            nombres.add(temp);

            System.out.print("Introducir nombre: ");
            temp = sc.nextLine();
        }

        System.out.println("Datos ordenados alfabéticamente, sin repetidos:\n" + nombres);
    }
}