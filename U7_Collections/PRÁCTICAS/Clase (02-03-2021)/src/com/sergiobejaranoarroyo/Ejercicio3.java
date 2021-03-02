package com.sergiobejaranoarroyo;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcion;

        Carrito carrito1 = new Carrito();

        do {
            mostrarMenur();
            opcion = sc.nextLine();

            if (opcion.equals("1")) {
                System.out.println("Introduce el Nombre del Producto:");
                String nombre = sc.nextLine();
                System.out.println("Introduce el Precio del Producto:");
                Double precio = sc.nextDouble();
                System.out.println("Introduce la Cantidad del Productos:");
                Integer cantidad = sc.nextInt();

                Producto producto1 = new Producto(nombre, cantidad, precio);
                carrito1.getProductos().add(producto1);
            } else if (opcion.equals("2")) {
                System.out.println(carrito1);
            }
        } while (!opcion.equals("3"));
    }

    public static void mostrarMenur() {
        System.out.println("1 - Añadir Producto.");
        System.out.println("2 - Mostrar Carrito.");
        System.out.println("3 - Salir.");
    }
}