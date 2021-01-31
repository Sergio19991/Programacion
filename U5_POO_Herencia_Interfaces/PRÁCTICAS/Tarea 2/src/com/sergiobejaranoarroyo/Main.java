package com.sergiobejaranoarroyo;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("***************");
        System.out.println("* ACTIVIDAD 1 *");
        System.out.println("***************");
        Pila pila1 = new PilaTabla();
        for (int i = 0; i < 10; i++) {
            pila1.apilar(i);
        }
        Integer num = pila1.desapilar();
        while (num != null) {
            System.out.println(num);
            num = pila1.desapilar();
        }
        System.out.println();


        System.out.println("***************");
        System.out.println("* ACTIVIDAD 2 *");
        System.out.println("***************");
        Cliente[] tablaClientes = new Cliente[5];
        tablaClientes[0] = new Cliente("435", "Jorge", 34, 6200);
        tablaClientes[1] = new Cliente("235", "Ana", 20, 3200);
        tablaClientes[2] = new Cliente("125", "Julio", 20, 4100);
        tablaClientes[3] = new Cliente("465", "Hector", 30, 5200);
        tablaClientes[4] = new Cliente("115", "Anne", 58, 1200);
        Arrays.sort(tablaClientes);
        System.out.println("Por DNI: " + Arrays.toString(tablaClientes));
        System.out.println("Por nombres: " + Arrays.toString(tablaClientes));
        System.out.println();
    }
}