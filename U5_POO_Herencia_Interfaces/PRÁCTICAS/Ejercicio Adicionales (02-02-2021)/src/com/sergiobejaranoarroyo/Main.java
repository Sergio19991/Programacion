package com.sergiobejaranoarroyo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("***************");
        System.out.println("* EJERCICIO 1 *");
        System.out.println("***************");
        Scanner sc = new Scanner(System.in);
        int opcion;
        System.out.println("VEHÍCULOS");
        System.out.println("=========");
        System.out.println("1. Anda con bicicleta");
        System.out.println("2. Haz el caballito con la bicleta");
        System.out.println("3. Anda con el coche");
        System.out.println("4. Quema rueda con el coche");
        System.out.println("5. Ver kilometraje de la bicicleta");
        System.out.println("6. Ver kilometraje del coche");
        System.out.println("7. Ver kilometraje total");
        System.out.println("8. Salir");
        System.out.println("Elige una opción (1-8)");
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("HAS ELEGIDO LA PRIMERA OPCIÓN");
                break;
            case 2:
                System.out.println("HAS ELEGIDO LA SEGUNDA OPCIÓN");
                break;
            case 3:
                System.out.println("HAS ELEGIDO LA TERCERA OPCIÓN");
                break;
            case 4:
                System.out.println("HAS ELEGIDO LA CUARTA OPCIÓN");
                break;
            case 5:
                System.out.println("HAS ELEGIDO LA QUINTA OPCIÓN");
                break;
            case 6:
                System.out.println("HAS ELEGIDO LA SEXTA OPCIÓN");
                break;
            case 7:
                System.out.println("HAS ELEGIDO LA SÉPTIMA OPCIÓN");
                break;
            case 8:
                System.out.println("HAS ELEGIDO LA OCTAVA OPCIÓN");
                break;
            default:
                System.out.println("No has elegido ningúna opción.....");
        }
        System.out.println();


        System.out.println("***************");
        System.out.println("* EJERCICIO 2 *");
        System.out.println("***************");
        Ameba a1 = new Ameba();
        a1.come(2);
        System.out.println(a1);
        Ameba a2 = new Ameba();
        a2.come(4);
        System.out.println(a2);
        /*a1.come(a2);*/
        System.out.println(a1);
        System.out.println(a2);
        a2.come(3);
        System.out.println(a2);
        System.out.println();


        System.out.println("***************");
        System.out.println("* EJERCICIO 3 *");
        System.out.println("***************");
        TarjetaRegalo t1 = new TarjetaRegalo(100, 67324);
        TarjetaRegalo t2 = new TarjetaRegalo(120, 2788);
        System.out.println(t1);
        System.out.println(t2);
        t1.gasta(45.90);
        t2.gasta(5);
        t2.gasta(500);
        t1.gasta(3.55);
        System.out.println(t1);
        System.out.println(t2);
        /*TarjetaRegalo t3 = t1.fusionaCon(t2);*/
        TarjetaRegalo t3 = new TarjetaRegalo(165.55, 59032);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println();


        System.out.println("***************");
        System.out.println("* EJERCICIO 4 *");
        System.out.println("***************");
        Libro libro1 = new Libro("NOMBRE_LIBRO 1", "EDITORIAL_LIBRO 1", "AUTOR_LIBRO 1");
        Libro libro2 = new Libro("NOMBRE_LIBRO 2", "EDITORIAL_LIBRO 2", "AUTOR_LIBRO 2");
        Libro libro3 = new Libro("NOMBRE_LIBRO 3", "EDITORIAL_LIBRO 3", "AUTOR_LIBRO 3");
        Revista revista1 = new Revista("NOMBRE_REVISTA 1", "EDITORIAL_REVISTA 1", 1999, 3);
        Revista revista2 = new Revista("NOMBRE_REVISTA 2", "EDITORIAL_REVISTA 2", 2021, 1);
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);
        System.out.println(revista1);
        System.out.println(revista2);
        /*libro2.presta();
        if (libro2.estaPrestado()) {
            System.out.println("El libro está prestado");
        }
        libro2.presta();
        libro2.devuelve();
        if (libro2.estaPrestado()) {
            System.out.println("El libro está prestado");
        }
        libro3.presta();
        System.out.println(libro2);
        System.out.println(libro3);
        System.out.println();*/
    }
}