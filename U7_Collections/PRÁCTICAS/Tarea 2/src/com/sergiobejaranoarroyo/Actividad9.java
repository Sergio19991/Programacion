package com.sergiobejaranoarroyo;

import java.util.HashSet;
import java.util.Set;

public class Actividad9 {
    public static void main(String[] args) {
        Set<Integer> conjunto1 = new HashSet<Integer>();
        Set<Integer> conjunto2 = new HashSet<Integer>();

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

        System.out.println("Conjuntos Unidos:");
        System.out.println(union(conjunto1, conjunto2));
    }

    public static Set union(Set conjunto1, Set conjunto2) {
        Set<Integer> resultado = new HashSet<>(conjunto1);

        resultado.addAll(conjunto2);

        return resultado;
    }
}