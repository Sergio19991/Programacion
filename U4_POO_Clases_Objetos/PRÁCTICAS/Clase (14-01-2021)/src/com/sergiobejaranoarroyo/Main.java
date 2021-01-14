package com.sergiobejaranoarroyo;

import java.util.SortedMap;

public class Main {

    public static void main(String[] args) {
        Conjunto c1 = new Conjunto(3);
        Conjunto c2 = new Conjunto(10);

        c1.addElement(10);
        c2.addElement(20);
        c1.addElement(30);

        System.out.println(c1.addElement(40));

        System.out.println(c1);

        c1.removeElement(20);

        System.out.println(c1);

        c2.addElement(50);
        c2.addElement(60);
        c2.addElement(70);
        c2.addElement(80);
        c2.addElement(10);

        c2.addConjunto(c1);

        System.out.println(c2);

        c1.addElement(20);
        c1.addElement(70);

        System.out.println(c1);
        System.out.println(c1);

        System.out.println(Conjunto.union(c1, c2));
        System.out.println(Conjunto.interseccion(c1, c2));
        System.out.println(Conjunto.diferencia(c1, c2));
        System.out.println(Conjunto.diferencia(c2, c1));
    }
}