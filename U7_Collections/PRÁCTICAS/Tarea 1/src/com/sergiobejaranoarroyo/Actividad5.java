package com.sergiobejaranoarroyo;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Actividad5 {
    public static void main(String[] args) {
        Set<Integer> listaAleatorios = new TreeSet<>(new ordenDecreciente());

        while (listaAleatorios.size() < 20) {
            Integer aleatorio = (int) (Math.random() * 100);
            listaAleatorios.add(aleatorio);
        }

        System.out.println(listaAleatorios);
    }

    static class ordenDecreciente implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            return (Integer) o2 - (Integer) o1;
        }
    }
}