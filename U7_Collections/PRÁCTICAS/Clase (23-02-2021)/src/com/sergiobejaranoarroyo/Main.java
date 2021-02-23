package com.sergiobejaranoarroyo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        Cliente cliente1 = new Cliente("CLIENTE 1", "APELLIDOS 1", "DIRECCIÓN 1", "123456789-A");
        Cliente cliente2 = new Cliente("CLIENTE 2", "APELLIDOS 2", "DIRECCIÓN 2", "123456789-B");
        Cliente cliente3 = new Cliente("CLIENTE 3", "APELLIDOS 3", "DIRECCIÓN 3", "123456789-C");

        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        clientes.add(cliente1);

        /*Cliente cliente4 = clientes.remove(4);

        System.out.println(cliente4);

        clientes.remove(cliente1);

        System.out.println(clientes.toString());*/

        Iterator it = clientes.iterator();
        while (it.hasNext()) {
            Cliente c = (Cliente) it.next();
            System.out.println(c);
        }

        for (Cliente c : clientes) {
            System.out.println(c);
        }
    }
}