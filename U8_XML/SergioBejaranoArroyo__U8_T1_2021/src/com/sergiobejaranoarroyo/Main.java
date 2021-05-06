package com.sergiobejaranoarroyo;

import java.util.Scanner;

import static com.sergiobejaranoarroyo.RecorridoDOM.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\n\n\t\t\tMENÚ:");
        mostrarXML("breakfastMenu.xml");
        System.out.println("\n\n\n");

        System.out.println("\t\t\tPLATOS: ");
        cantidadDePlatos();
        System.out.println("\n\n\n");

        System.out.println("\t\t\tPRECIO:");
        platoMasCaro();
        System.out.println("\n\n\n");

        System.out.println("\t\t\tNUEVO PLATO:");
        System.out.print("Introduce el Nombre: ");
        String nombre = sc.next();
        System.out.print("Introduce el Precio: ");
        double precio = sc.nextDouble();
        System.out.println("Introduce la Descripción: ");
        String descripcion = sc.next();
        System.out.println();
        NuevaComida nuevaComida = new NuevaComida(nombre, precio, descripcion);
    }
}