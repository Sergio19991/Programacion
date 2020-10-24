package com.sbejarano;

import java.util.Scanner;

public class tercero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre, apellidos, direccion;

        System.out.println("Introduce el Nombre:");
        nombre = sc.nextLine();
        System.out.println("Introduce los Apellidos:");
        apellidos = sc.nextLine();
        System.out.println("Introduce la Dirección:");
        direccion = sc.nextLine();

        System.out.println("_____________________");
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellidos: "+apellidos);
        System.out.println("Dirección: "+direccion);
        System.out.println("_____________________");

        System.out.println("Te llamas "+nombre+" "+apellidos+", y vives en "+direccion+".");
    }
}
