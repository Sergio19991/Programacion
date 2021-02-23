package com.sergiobejaranoarroyo;

import java.util.*;

public class Actividad8 {

    static List eliminarRepetidos(List c) {
        Set temp = new LinkedHashSet(c);
        return new ArrayList(temp);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> lista = new ArrayList<>();

        System.out.print("Introducir nombre (\"fin\" para terminar): ");
        String nombre = sc.nextLine();

        while (!nombre.equalsIgnoreCase("fin")) {
            lista.add(nombre);
            System.out.print("Introducir nombre: ");
            nombre = sc.nextLine();
        }

        System.out.println();

        System.out.println("Lista Original:");
        System.out.println(lista);
        System.out.println();

        System.out.println("Lista sin Repetir:");
        lista = eliminarRepetidos(lista);
        System.out.println(lista);
    }
}