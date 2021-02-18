package com.sergiobejaranoarroyo;

import java.io.*;

public class Main implements Serializable {

    public static void main(String[] args) throws IOException {
        Persona persona1 = new Persona("NOMBRE 1", "APELLIDOS 1");
        Persona persona2 = new Persona("NOMBRE 2", "APELLDIOS 2");
        Persona persona3 = new Persona("NOMBRE 3", "APELLIDOS 3");

        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        ObjectOutputStream flujo_salida;

        try {
            flujo_salida = new ObjectOutputStream(new FileOutputStream("datos.dat"));
            flujo_salida.writeObject(numeros);
            flujo_salida.close();
        } catch (IOException e) {
            System.out.println("¡Error al escribir el fichero!");
        }

        int[] tabla = new int[10];

        ObjectInput flujoEntrada = null;
        for (int i = 0; i < 10; i++) {
            tabla[i] = flujoEntrada.readInt();
        }

        try {
            String cadena = (String) flujoEntrada.readObject();
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}