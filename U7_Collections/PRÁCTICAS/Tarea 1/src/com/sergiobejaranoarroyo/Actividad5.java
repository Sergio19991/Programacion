package com.sergiobejaranoarroyo;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class Actividad5 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> listaAleatorios = new LinkedHashSet<>();

        for (int i = 0; i < 20; i++) {
            listaAleatorios.add((int) (Math.random() * 100));
            listaAleatorios.stream().min (new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o1 - o2;
                }
            });

            System.out.println(listaAleatorios);
        }
    }
}