package com.sergiobejaranoarroyo;

import java.util.HashSet;
import java.util.Set;

public class Actividad12 {
    public static void main(String[] args) {
        Set conjunto1 = new HashSet();
        Set conjunto2 = new HashSet();

        conjunto1.add(7);
        conjunto1.add(4);
        conjunto1.add(5);
        conjunto1.add(6);

        conjunto2.add(7);
        conjunto2.add(4);
        conjunto2.add(5);
        conjunto2.add(6);

        System.out.println("Conjunt 1:");
        System.out.println(conjunto1);
        System.out.println();

        System.out.println("Conjunto 2:");
        System.out.println(conjunto2);
        System.out.println();

        System.out.println("¿Incluye?:");
        System.out.println(incluido(conjunto1, conjunto2));
    }

    public static boolean incluido(Set conjunto1, Set conjunto2) {
        return conjunto2.containsAll(conjunto1);
    }
}