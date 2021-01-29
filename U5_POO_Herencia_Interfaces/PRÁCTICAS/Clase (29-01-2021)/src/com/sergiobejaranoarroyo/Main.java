package com.sergiobejaranoarroyo;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Integer[] tabla = new Integer[20];

        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = (int) (Math.random() * 101 + 1);
        }

        System.out.println("ARRAY CREADO:");
        System.out.println(Arrays.toString(tabla));
        System.out.println();

        System.out.println("ORDERN POR DEFECTO");
        Arrays.sort(tabla);
        System.out.println(Arrays.toString(tabla));
        System.out.println();
        System.out.println();
        System.out.println();

        Libro libro1 = new Libro("321465978", 120, 20.2, "AUTOR 1", "EDITORIAL 1");
        Libro libro2 = new Libro("132978465", 140, 19.16, "AUTOR 2", "EDITORIAL 2");
        Libro libro3 = new Libro("321159321", 130, 23.20, "AUTOR 3", "EDITORIAL 3");
        Libro libro4 = new Libro("978321465", 121, 42.00, "AUTOR 4", "EDITORIAL 4");
        Libro libro5 = new Libro("321369147", 160, 62.15, "AUTOR 5", "EDITORIAL 5");
        Libro libro6 = new Libro("963258147", 200, 71.98, "AUTOR 6", "EDITORIAL 6");
        Libro libro7 = new Libro("465978321", 90, 80.21, "AUTOR 7", "EDITORIAL 7");
        Libro libro8 = new Libro("147258369", 100, 14.10, "AUTOR 8", "EDITORIAL 8");
        Libro libro9 = new Libro("147465369", 76, 16.12, "AUTOR 9", "EDITORIAL 9");
        Libro libro10 = new Libro("159465375", 148, 41.23, "AUTOR 10", "EDITORIAL 10");

        Libro[] libros = new Libro[10];
        libros[0] = libro1;
        libros[1] = libro2;
        libros[2] = libro3;
        libros[3] = libro4;
        libros[4] = libro5;
        libros[5] = libro6;
        libros[6] = libro7;
        libros[7] = libro8;
        libros[8] = libro9;
        libros[9] = libro10;

        System.out.println("LIBRO SIN ORDENAR");
        System.out.println(Arrays.toString(libros));
        System.out.println();

        System.out.println("ORDEN POR DEFECTO (por isbn):");
        Arrays.sort(libros);
        System.out.println(Arrays.toString(libros));
        System.out.println();
    }
}