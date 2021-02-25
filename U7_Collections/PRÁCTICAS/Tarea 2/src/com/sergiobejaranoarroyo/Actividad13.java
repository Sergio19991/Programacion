package com.sergiobejaranoarroyo;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Actividad13 {
    public static void main(String[] args) {
        Set conjunto1 = new HashSet();
        Set conjunto2 = new HashSet();

        conjunto1.add(7);
        conjunto1.add(4);
        conjunto1.add(5);
        conjunto1.add(6);

        conjunto2.add(3);
        conjunto2.add(11);
        conjunto2.add(15);
        conjunto2.add(6);

        System.out.println("Conjunt 1:");
        System.out.println(conjunto1);
        System.out.println();

        System.out.println("Conjunto 2:");
        System.out.println(conjunto2);
        System.out.println();

        System.out.println("Lista Fusionada:");
        System.out.println(fusionLista(conjunto1, conjunto2));
    }

    public static Set fusionLista(Set conjunto1, Set conjunto2) {
        Set resultado1 = new TreeSet(conjunto1);
        Set resultado2 = new TreeSet(conjunto2);

        resultado1.addAll(conjunto2);

        return resultado1;
    }
}