package com.sergiobejaranoarroyo;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Pepe", "33333333-K", 25, 100);
        Cliente cliente2 = new Cliente("Lucas", "3333345-K", 31, 800);
        Cliente cliente3 = new Cliente("Maria", "98733333-K", 23, 300);
        Cliente cliente4 = new Cliente("Juan", "69333333-K", 41, 900);
        Cliente cliente5 = new Cliente("Lorena", "61033333-K", 19, 600);

        Cliente[] clientes = new Cliente[5];
        clientes[0] = cliente1;
        clientes[1] = cliente2;
        clientes[2] = cliente3;
        clientes[3] = cliente4;
        clientes[4] = cliente5;

        Arrays.sort(clientes);

        System.out.println(Arrays.toString(clientes));
    }
}