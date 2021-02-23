package com.sergiobejaranoarroyo;

import java.util.Comparator;
import java.util.LinkedList;

public class Actividad3 {
    public static void main(String[] args) {
        LinkedList<Integer> listaAleatorios = new LinkedList<>();

        for (int i = 0; i < 20; i++) {
            listaAleatorios.add((int) (Math.random() * 10));
            listaAleatorios.sort(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2 - o1;
                }
            });

            System.out.println(listaAleatorios);
        }
    }
}