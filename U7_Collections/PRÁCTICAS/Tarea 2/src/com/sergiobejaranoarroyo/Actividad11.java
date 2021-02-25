package com.sergiobejaranoarroyo;

import java.util.HashSet;
import java.util.Set;

public class Actividad11 {
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

        System.out.println("Conjuntos Unidos:");
        System.out.println(diferencia(conjunto1, conjunto2));
    }

    public static Set diferencia(Set conjunto1, Set conjunto2) {
        Set resultado = new HashSet<>(conjunto1);

        resultado.addAll(conjunto2);

        resultado.retainAll(conjunto1);

        return resultado;
    }
}