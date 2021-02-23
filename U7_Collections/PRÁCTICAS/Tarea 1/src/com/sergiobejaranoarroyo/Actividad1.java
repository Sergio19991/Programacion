package com.sergiobejaranoarroyo;

import java.util.Comparator;
import java.util.LinkedList;

public class Actividad1 {
    public static void main(String[] args) {
        LinkedList<Integer> listaAleatorios = new LinkedList<>();

        for (int i = 0; i < 20; i++) {
            listaAleatorios.add((int) (Math.random() * 100));
        }

        System.out.println("Desordenados:");
        System.out.println(listaAleatorios);
        System.out.println();

        System.out.println("Sentido Creciente:");
        listaAleatorios.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        System.out.println(listaAleatorios);
    }
}